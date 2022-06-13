package com.reeta.recyclerviewandchatproject.imageSlider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.reeta.recyclerviewandchatproject.R
import kotlin.math.abs

class ImageSliderActivity : AppCompatActivity() {

    lateinit var viewPager2: ViewPager2
    val imageList=ArrayList<SliderItem>()
    lateinit var imageAdapter: SliderAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_slider)
        viewPager2=findViewById(R.id.viewPager)
        buildData()
        setViewPager()

    }

    private fun setViewPager() {
        viewPager2.adapter=SliderAdapter(imageList,viewPager2)
        viewPager2.clipToPadding=false
        viewPager2.clipChildren=false
        viewPager2.offscreenPageLimit=3
        viewPager2.getChildAt(0).overScrollMode=RecyclerView.OVER_SCROLL_NEVER
        val compositePageTransformer=CompositePageTransformer()
        compositePageTransformer.addTransformer(MarginPageTransformer(30))
        compositePageTransformer.addTransformer { page, position ->
            var r=1-abs(position)
            page.scaleY=0.75f+r*0.20f
        }
        viewPager2.setPageTransformer(compositePageTransformer)
    }


    private fun buildData() {
        imageList.add(SliderItem(R.drawable.movie1))
        imageList.add(SliderItem(R.drawable.movie2))
        imageList.add(SliderItem(R.drawable.movie3))
        imageList.add(SliderItem(R.drawable.movie4))
        imageList.add(SliderItem(R.drawable.movie5))
    }
}