 package com.example.coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

 class MainActivity : AppCompatActivity() {

     val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            val net1 = doNet()
            Log.d(tag ,net1)

            val net2 = doNet2()
            Log.d(tag ,net2)
        }



    }
     suspend fun doNet(): String{
         delay(3000L)
         return "This is ans1"
     }
     suspend fun doNet2(): String{
         delay(3000L)
         return "This is ans2"
     }

}