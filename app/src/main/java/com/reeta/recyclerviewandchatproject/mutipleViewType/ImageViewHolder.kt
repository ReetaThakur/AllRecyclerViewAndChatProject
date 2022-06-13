package com.reeta.recyclerviewandchatproject.mutipleViewType

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reeta.recyclerviewandchatproject.R

class ImageViewHolder(itemView:View,listner: ItemClickListner):RecyclerView.ViewHolder(itemView) {

    val image:ImageView=itemView.findViewById(R.id.natureImage)
    val imageName:TextView=itemView.findViewById(R.id.tvImageQuote)

    fun setImage(modelClass: ModelClass){
        image.setImageResource(modelClass.resId)
        imageName.text=modelClass.content
    }

}