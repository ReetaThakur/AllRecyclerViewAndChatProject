package com.reeta.recyclerviewandchatproject.whatsApp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.reeta.recyclerviewandchatproject.R

class ChatAdapter(var msgList:ArrayList<BaseModel>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//      when(viewType){
//           0->{
//               val view= LayoutInflater.from(parent.context).inflate(R.layout.sender_item_layout,parent,false)
//               return   SenderViewHolder(view)
//           }
//           1->{
//               val view= LayoutInflater.from(parent.context).inflate(R.layout.receive_item_layout,parent,false)
//               return   ReceiverViewHolder(view)
//           }
//      }
        return if (viewType==0){
            val view= LayoutInflater.from(parent.context).inflate(R.layout.sender_item_layout,parent,false)
            SenderViewHolder(view)
        }else{
            val view= LayoutInflater.from(parent.context).inflate(R.layout.receive_item_layout,parent,false)
            ReceiverViewHolder(view)
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var viewType=msgList[position].getViewType()
        when(viewType){
            0->{
                if (holder is SenderViewHolder) {
                    holder.setData(msgList[position] as SenderModel)
                }

            }
            1->{
                if (holder is ReceiverViewHolder) {
                    holder.setData(msgList[position] as ReceiverModel)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return msgList.size
    }

    override fun getItemViewType(position: Int): Int {
        return msgList[position].getViewType()
    }
}