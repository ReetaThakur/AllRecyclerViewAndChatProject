package com.reeta.recyclerviewandchatproject.whatsApp

data class SenderModel(var senderMessage: String):BaseModel() {

    override fun getViewType(): Int {
        return 0
    }
}
