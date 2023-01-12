package com.android.dynamicjokes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.dynamicjokes.R

class JokeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_joke)
    }
}