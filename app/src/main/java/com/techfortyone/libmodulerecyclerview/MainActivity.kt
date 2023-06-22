package com.techfortyone.libmodulerecyclerview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makeToastMessage(context: Context, message :String) {
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }
}