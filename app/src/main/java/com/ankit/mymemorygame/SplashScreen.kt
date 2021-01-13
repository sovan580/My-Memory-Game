package com.ankit.mymemorygame

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView

class SplashScreen : Activity() {
    private lateinit var logo:ImageView
    private lateinit var start:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        logo=findViewById(R.id.logo)
        start=findViewById(R.id.start)
        val i=logo.animate().apply {
            duration=3000
            rotationYBy(360f)
        }.start()
        start.setOnClickListener{
            intent=Intent(this,GameMenu::class.java)
            startActivity(intent)
            finish()
        }
    }
}