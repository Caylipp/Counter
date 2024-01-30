package com.hoang.msu.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hoang.msu.counter.databinding.ActivityMainBinding


class Counter{

    private var count : Int = 0
    fun addCount(){
        count++
    }
    fun getCount() : Int {
        return count
    }
}
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var count : Counter = Counter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tapButton.setOnClickListener {
            count.addCount()
            binding.countView.text = count.getCount().toString()
        }
    }

}