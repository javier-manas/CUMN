package com.example.androidjavi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.androidjavi.SegundaApp.imcActivity
import com.example.androidjavi.appPrueba.appPruebaActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btn1app = findViewById<Button>(R.id.btnMenuApp)
        val btn2app = findViewById<Button>(R.id.btn2app)
        btn1app.setOnClickListener{navToPrueba()}
        btn2app.setOnClickListener{navTo2app()}
    }

    private fun navTo2app() {
        val intent = Intent(this, imcActivity::class.java)
        startActivity(intent)
    }

    fun navToPrueba(){
        val intent = Intent(this, appPruebaActivity::class.java)
        startActivity(intent)
    }
}