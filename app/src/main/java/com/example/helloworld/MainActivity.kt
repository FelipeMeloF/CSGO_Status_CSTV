package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_load)
        setContentView(R.layout.activity_main)

        // get reference to button
        val btn_click_me = findViewById(R.id.button) as Button
        val btn2_click_me = findViewById(R.id.button2) as Button
        var myText = findViewById(R.id.textView) as TextView
        var vezes = 0
        // set on-click listener

        btn_click_me.setOnClickListener {
            Toast.makeText(this@MainActivity, "botao clicado.", Toast.LENGTH_SHORT).show()
            vezes++
            myText.text = "Vezes clicado " + vezes.toString()

        }

        btn2_click_me.setOnClickListener {
            Toast.makeText(this@MainActivity, "botao clicado.", Toast.LENGTH_SHORT).show()
            vezes--
            if(vezes == -1 ) {
                vezes = 0
            }
            myText.text = "Vezes clicado " + vezes.toString()

        }

    }
}