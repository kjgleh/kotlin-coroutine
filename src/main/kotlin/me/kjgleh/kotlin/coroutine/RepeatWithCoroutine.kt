package me.kjgleh.kotlin.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class RepeatWithCoroutine {

    fun test() = runBlocking {
        repeat(10_000) { // launch a lot of coroutines
            launch {
                delay(5000L)
                print(".")
            }
        }
    }
}