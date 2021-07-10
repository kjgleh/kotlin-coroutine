package me.kjgleh.kotlin.coroutine

import kotlin.concurrent.thread

class RepeatWithThread {

    fun test() = run {
        repeat(10_000) {
            thread {
                Thread.sleep(5000L)
                print(".")
            }
        }
    }
}