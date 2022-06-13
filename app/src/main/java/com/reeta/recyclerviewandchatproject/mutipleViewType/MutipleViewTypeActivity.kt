package com.reeta.recyclerviewandchatproject.mutipleViewType

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import androidx.recyclerview.widget.LinearLayoutManager
import com.reeta.recyclerviewandchatproject.R
import kotlinx.android.synthetic.main.activity_mutiple_view_type.*

class MutipleViewTypeActivity : AppCompatActivity(),ItemClickListner {

    var list=ArrayList<ModelClass>()
    lateinit var multipleAdapter:MultipleViewTypeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mutiple_view_type)
        buildData()
        setRecyclerView()
    }

    private fun setRecyclerView() {
        multipleAdapter=MultipleViewTypeAdapter(list,this)
        val linearLayoutManager=LinearLayoutManager(this)
        mutipleRecycerView.apply {
            layoutManager=linearLayoutManager
            adapter=multipleAdapter

        }
    }

    private fun buildData() {
        for (i in 1..5) {
            list.add(ModelClass("Hii Reeta your package is 18 lakhs", 5, ModelClass.text_type))
            list.add(ModelClass("This is nature's image ", R.drawable.imagen, ModelClass.image_type))
            list.add(ModelClass("this is soorma anthom song", R.raw.soorma, ModelClass.audio_type))
            list.add(ModelClass("Beautiful image ", R.drawable.imagep, ModelClass.image_type))
        }
    }

    override fun onItemClick(modelClass: ModelClass, postion: Int) {
        TODO("Not yet implemented")
    }
}