package com.reeta.recyclerviewandchatproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.reeta.recyclerviewandchatproject.editRecyclerViewItem.EditActivity
import com.reeta.recyclerviewandchatproject.imageSlider.ImageSliderActivity
import com.reeta.recyclerviewandchatproject.mutipleViewType.MutipleViewTypeActivity
import com.reeta.recyclerviewandchatproject.whatsApp.WhatsAppActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEdit.setOnClickListener {
            val intent=Intent(this,EditActivity::class.java)
            startActivity(intent)
        }

        btnWhatsApp.setOnClickListener {
            val intent=Intent(this, WhatsAppActivity::class.java)
            startActivity(intent)
        }

        btnMutipleViewType.setOnClickListener {
            val intent=Intent(this, MutipleViewTypeActivity::class.java)
            startActivity(intent)
        }
        btnAutoImageSlider.setOnClickListener {
            val intent=Intent(this, ImageSliderActivity::class.java)
            startActivity(intent)
        }
    }
}