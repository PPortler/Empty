package com.example.empty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var main_button_login: Button? = null
    var main_button_create: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        main_button_login?.setOnClickListener {
            var intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
    }
    fun init(){
        main_button_login = findViewById(R.id.main_button_login)
        main_button_create = findViewById(R.id.main_button_create)
    }
}