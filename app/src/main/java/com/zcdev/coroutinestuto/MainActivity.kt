package com.zcdev.coroutinestuto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // doTaskA(1)
     //  printTextAfterDelay("print me after 3 second")


    }


    fun printTextAfterDelay1(text:String){
        Thread.sleep(3000L)
        Log.d("mytext",text)
    }

    /*
    suspend function
    * just to make func able to stop/resume
    * not responsible to do stuff in back thread
    * must be called from another sus fun or corotines builder
    * */
    suspend fun printTextAfterDelay2(text:String){
        delay(3000)
        Log.d("mytext",text)
    }



    //copperation betwin two fun without cotoutines
    /*fun doTaskA(label:Int){
        when(label){
            1->
            {
            Log.d("task A","we are in one task A")
            doTaskB(1)
            }
            2->
            {
                Log.d("task A","we are in two task A")
                doTaskB(2)
            }
            3->
            {
                Log.d("task A","we are in three task A")
                doTaskB(3)
            }

        }
    }
    fun doTaskB(label:Int){
        when(label){
            1->
            {
                Log.d("task B","we are in one task B")
                doTaskA(2)
            }
            2->
            {
                Log.d("task B","we are in two task B")
                doTaskA(3)
            }
            3->
            {
                Log.d("task B","we are in three task B")

            }

        }
    }*/
}