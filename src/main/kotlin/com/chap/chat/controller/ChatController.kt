package com.chap.chat.controller

import com.chap.chat.data.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatController {

    @GetMapping
    fun index(): List<Message> = listOf(
        Message("1", "hello"),
        Message("2", "bonjour"),
        Message("3", "ahola")
    )
}