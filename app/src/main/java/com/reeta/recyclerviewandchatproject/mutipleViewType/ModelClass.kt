package com.reeta.recyclerviewandchatproject.mutipleViewType

 data class ModelClass(var content:String,var resId:Int,var itemViewType:Int){

  companion object{
     val  text_type:Int=0
      val image_type:Int=1
      val audio_type:Int=2
  }


 }
