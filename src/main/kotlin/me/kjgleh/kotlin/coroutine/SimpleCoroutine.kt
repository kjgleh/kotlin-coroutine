package me.kjgleh.kotlin.coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class SimpleCoroutine {

    fun test() {
        runBlocking { // this: CoroutineScope
            launch { // launch a new coroutine and continue
                doWorld()
            }
            println("Hello") // main coroutine continues while a previous one is delayed
        }
    }

    private suspend fun doWorld() {
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }

    fun test2() = runBlocking {
        doWorld2()
    }

    private suspend fun doWorld2() = coroutineScope {  // this: CoroutineScope
        launch {
            delay(1000L)
            println("World!")
        }
        println("Hello")
    }
}