package com.saraebadi.animation;

import android.util.Log;

class Test2 extends Thread{
    @Override
    public void run() {
        Log.d("ttt","test class thread is >>>"+ Thread.currentThread().getName());
    }
}

