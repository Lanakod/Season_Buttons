package com.left2create.seasonbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun autumnClick(view: View)
    {
        val image = findViewById<ImageView>(R.id.imageView)
        image.setImageResource(R.drawable.autumn)
    }

    fun winterClick(view: View)
    {
        val image = findViewById<ImageView>(R.id.imageView)
        image.setImageResource(R.drawable.winter)
    }

    fun springClick(view: View)
    {
        val image = findViewById<ImageView>(R.id.imageView)
        image.setImageResource(R.drawable.spring)
    }

    fun summerClick(view: View)
    {
        val image = findViewById<ImageView>(R.id.imageView)
        image.setImageResource(R.drawable.summer)
    }

    fun exitClick(view: View)
    {
        exitProcess(0)
    }
}