package com.reeta.recyclerviewandchatproject.whatsApp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reeta.recyclerviewandchatproject.R

class SenderViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        val senderMsg:TextView=itemView.findViewById(R.id.senderMsg)
        fun setData(senderModel: SenderModel){
             senderMsg.text=senderModel.senderMessage
        }
}

