package com.hoang.msu.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class Counter{

    private var count : Int = 0;
    fun addCount(){
        count++
    }
    fun getCount() : Int {
        return count
    }
}
class MainActivity : AppCompatActivity() {
    private lateinit var tapButton : Button
    private lateinit var display : TextView
    private var count : Counter = Counter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tapButton = findViewById(R.id.tap_button)
        display = findViewById(R.id.countView)

        tapButton.setOnClickListener{
            count.addCount()
            display.text = count.getCount().toString()
            /*
            Toast.makeText(
                this,
                R.string.tap_button,
                Toast.LENGTH_SHORT
            ).show()
            */
        }
    }



}