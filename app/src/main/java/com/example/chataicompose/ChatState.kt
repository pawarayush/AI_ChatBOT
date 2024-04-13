package com.example.chataicompose

//import com.google.ai.client.generativeai.Chat
import android.graphics.Bitmap
import com.example.chataicompose.data.Chat


data class ChatState (
    val chatList : MutableList<Chat> = mutableListOf(),
    val prompt:String="",
    val bitmap: Bitmap?=null

)


