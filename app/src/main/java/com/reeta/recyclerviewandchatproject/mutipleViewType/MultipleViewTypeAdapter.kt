package com.reeta.recyclerviewandchatproject.mutipleViewType

import android.media.Image
import android.view.Display
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.reeta.recyclerviewandchatproject.R

class MultipleViewTypeAdapter(var list:ArrayList<ModelClass>,var listner: ItemClickListner):RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.text_view_item_ype,parent,false)
        when(viewType){
            ModelClass.text_type ->{
                val view=LayoutInflater.from(parent.context).inflate(R.layout.text_view_item_ype,parent,false)
                return TextViewHolder(view,listner)
            }

            ModelClass.audio_type ->{
                val view=LayoutInflater.from(parent.context).inflate(R.layout.audio_item_layout,parent,false)
                return AudioViewHolder(view,listner)
            }
            ModelClass.image_type ->{
                val view=LayoutInflater.from(parent.context).inflate(R.layout.image_item_layout,parent,false)
                return ImageViewHolder(view,listner)
            }
        }
        return null!!
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var viewType:Int=list[position].itemViewType
        var model:ModelClass=list[position]
        when(viewType){
            ModelClass.text_type ->{
                if (holder is TextViewHolder){
                    holder.setText(model)
                }
            }
            ModelClass.audio_type->{
                if (holder is AudioViewHolder){
                    holder.setAudio(model)
                }
            }
            ModelClass.image_type ->{
                if (holder is ImageViewHolder){
                    holder.setImage(model)
                }
            }
        }
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].itemViewType
    }


}