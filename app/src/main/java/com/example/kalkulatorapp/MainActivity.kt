package com.example.kalkulatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTapNumber(view: View) {
        val txtInput = findViewById<TextView>(R.id.txtInput)
        val buttonInput = (view as Button)

        txtInput.append(buttonInput.text)
    }

    fun onBackspace(view: View) {
        val txtInput = findViewById<TextView>(R.id.txtInput)
        val length = txtInput.length()

        if (length > 0 ) {
            txtInput.text = txtInput.text.substring(0, length - 1)
            Log.i("LengthText", txtInput.length().toString())
        }
    }
}
