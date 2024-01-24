package com.hoang.msu.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var tapButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tapButton = findViewById(R.id.tap_button)

        tapButton.setOnClickListener{view : View ->
            Toast.makeText(
                this,
                R.string.tap_button,
                Toast.LENGTH_SHORT)
                .show()
        }
    }


}