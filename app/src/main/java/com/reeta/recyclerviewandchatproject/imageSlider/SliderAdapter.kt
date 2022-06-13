package com.reeta.recyclerviewandchatproject.imageSlider

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.reeta.recyclerviewandchatproject.R

class SliderAdapter(val imageList:List<SliderItem>,val viewPager2: ViewPager2):RecyclerView.Adapter<SliderAdapter.SliderViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.silder_image,parent,false)
        return SliderViewHolder(view)
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        holder.setData(imageList[position])
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    class SliderViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val roundImage:ImageView=itemView.findViewById(R.id.imageSlider)
        fun setData(sliderItem: SliderItem){
            roundImage.setImageResource(sliderItem.image)
        }

    }
}