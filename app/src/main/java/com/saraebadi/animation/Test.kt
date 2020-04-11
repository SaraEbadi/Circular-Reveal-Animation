package com.saraebadi.animation

import android.util.Log

class Test : Thread(){

    override fun run() {
        super.run()
        Log.d("tt","test class thread is >>> ${Thread.currentThread().name}")
    }
}

fun main(){
    Test().start()
}