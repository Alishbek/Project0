package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var tvRandom: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvRandom = findViewById(R.id.tv_random)
    }

    private fun random() {
        var random: Random = Random(4)
        when(random){
            1 ->
        }
    }
}
