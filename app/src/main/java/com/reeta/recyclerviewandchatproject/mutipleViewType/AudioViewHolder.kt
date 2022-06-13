package com.reeta.recyclerviewandchatproject.mutipleViewType

import android.media.MediaPlayer
import android.view.Display
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reeta.recyclerviewandchatproject.R

class AudioViewHolder(itemView:View,listner: ItemClickListner):RecyclerView.ViewHolder(itemView) {
    val songName:TextView=itemView.findViewById(R.id.tvSongName)
    val play:Button=itemView.findViewById(R.id.btnPlayAudio)
    val pause:Button=itemView.findViewById(R.id.btnPauseAudio)

    fun setAudio(model:ModelClass){
        songName.text=model.content
        val mediaPlayer=MediaPlayer.create(songName.context,model.resId)
        play.setOnClickListener {
            mediaPlayer.start()
        }
        pause.setOnClickListener {
            if (mediaPlayer.isPlaying){
                mediaPlayer.pause()
            }
        }
    }

}