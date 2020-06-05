package com.example.first_coroutine

import android.graphics.DiscretePathEffect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Before runBlocking")
        runBlocking {

            launch(Dispatchers.IO) {
                delay(3000)
                Log.d(TAG, "Finsihed IO Coroutine 1")

            }

            launch(Dispatchers.IO) {
                delay(3000)
                Log.d(TAG, "Finsihed IO Coroutine 2")
            }

            Log.d(TAG, "Start of runBlocking")
            delay(5000)
            Log.d(TAG, "End of runBlocking")
        }


    }

}
