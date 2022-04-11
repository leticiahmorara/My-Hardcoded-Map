package com.example.myhardcodedmaps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var mbtnNext:Button ?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mbtnNext=findViewById(R.id.mbtnNext)
        mbtnNext!!.setOnClickListener {
            startActivity(Intent(this,MapsActivity::class.java))
        }
    }
}