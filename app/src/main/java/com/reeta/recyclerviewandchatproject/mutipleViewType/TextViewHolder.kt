package com.reeta.recyclerviewandchatproject.mutipleViewType

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reeta.recyclerviewandchatproject.R

class TextViewHolder(itemView:View,listner: ItemClickListner):RecyclerView.ViewHolder(itemView) {

    val textName:TextView=itemView.findViewById(R.id.tvSimpleText)

    fun setText(modelClass: ModelClass){
      textName.text=modelClass.content
    }
}