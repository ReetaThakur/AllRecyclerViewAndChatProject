package com.reeta.recyclerviewandchatproject.whatsApp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reeta.recyclerviewandchatproject.R

class ReceiverViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        val receiverMsg:TextView=itemView.findViewById(R.id.receiverMsg)

         fun setData(receiverModel: ReceiverModel){
            receiverMsg.text=receiverModel.receiveMessage
        }
}