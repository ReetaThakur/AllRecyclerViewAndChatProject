package com.reeta.recyclerviewandchatproject.whatsApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.reeta.recyclerviewandchatproject.R
import kotlinx.android.synthetic.main.activity_whats_app.*

class WhatsAppActivity : AppCompatActivity() {

    var list=ArrayList<BaseModel>()
    lateinit var chatAdapter: ChatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whats_app)

        imageSend.setOnClickListener {
            buildData()
        }
        setRecyclerView()
    }

    private fun setRecyclerView() {
        chatAdapter= ChatAdapter(list)
        val linearLayoutManager=LinearLayoutManager(this)
        recyclerView.apply {
            adapter=chatAdapter
            layoutManager=linearLayoutManager
        }
    }

    private fun buildData() {
        if (etChoice.text.toString() == "0"){
            list.add(SenderModel(etSendMessage.text.toString()))
        }else if (etChoice.text.toString() == "1"){
            list.add(ReceiverModel(etSendMessage.text.toString()))
        }
        chatAdapter.notifyDataSetChanged()
    }
}