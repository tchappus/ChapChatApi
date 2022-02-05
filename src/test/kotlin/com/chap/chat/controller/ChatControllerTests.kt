package com.chap.chat.controller

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class ChatControllerTests {

    private val controller = ChatController()

    @Test
    fun `test get`() {
        assertEquals(3, controller.index().size)
    }
}