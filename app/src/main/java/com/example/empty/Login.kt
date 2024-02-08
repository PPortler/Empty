package com.example.empty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextPaint
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class Login : AppCompatActivity() {
    var login_button_back:ImageButton? = null
    var login_edit_user:EditText? = null
    var login_edit_password:EditText? = null
    var login_button_login:Button? = null
    var login_button_forgot:Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        init()
        login_button_back?.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
    fun init(){
        login_button_back = findViewById(R.id.login_button_back)
        login_edit_user = findViewById(R.id.login_edit_user)
        login_edit_password = findViewById(R.id.login_edit_password)
        login_button_login = findViewById(R.id.login_button_login)
        login_button_forgot = findViewById(R.id.login_button_forgot)
    }
}