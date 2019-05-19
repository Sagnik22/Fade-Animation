package com.sagnik.fadeanimation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myImage = findViewById<ImageView>(R.id.image_view)
        val fade_btn = findViewById<Button>(R.id.fade_btn)
        val scale_btn = findViewById<Button>(R.id.scale_btn)


        scale_btn.setOnClickListener {

            val animation = AnimationUtils.loadAnimation( this@MainActivity,R.anim.scale)
            myImage.startAnimation(animation)

        }



        fade_btn.setOnClickListener {

            val animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.fade)
            myImage.startAnimation(animation)
        }
    }
}
