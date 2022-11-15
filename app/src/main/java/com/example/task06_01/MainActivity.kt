package com.example.task06_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun ej1(view: View) {
        val intent = Intent(this, MainActivity1::class.java)
        startActivity(intent)
    }

    fun ej2(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    fun ej3(view: View) {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }

    fun ej4(view: View) {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }

    fun ej5(view: View) {
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }

    fun ej6(view: View) {
        val intent = Intent(this, MainActivity6::class.java)
        startActivity(intent)
    }
}