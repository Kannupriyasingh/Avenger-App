package com.kannupriya.project1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class AvengersActivity : AppCompatActivity() {
    var titleName: String? = "Avengers"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview_example)

        if(intent != null){
            titleName = intent.getStringExtra("Name")
        }
        title = titleName
    }
}
