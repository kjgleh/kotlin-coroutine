package me.kjgleh.kotlin.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class CoroutineScope {

    fun test() = runBlocking {
        doWorld()
    }

    private suspend fun doWorld() = coroutineScope {  // this: CoroutineScope
        launch {
            delay(1000L)
            println("World!")
        }
        println("Hello")
    }
}