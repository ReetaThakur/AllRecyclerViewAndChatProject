package com.reeta.recyclerviewandchatproject.whatsApp

data class ReceiverModel(var receiveMessage:String):BaseModel() {

    override fun getViewType(): Int {
        return 1
    }
}
