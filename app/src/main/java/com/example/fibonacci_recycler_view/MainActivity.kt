package com.example.fibonacci_recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonacci_recycler_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
fibonacci()
    }

    private fun fibonacci() {
        val end = 100
        var start = 0
        var nextnum = 1
        print("First $end terms: ")
        var numbers = mutableListOf<Int>()
        for (i in 1..end) {
            numbers.add(start)
            val sum = start + nextnum
            start = nextnum
            nextnum = sum
        }
        var numbersAdapter = FibonacciRecyclerViewAdapter(numbers)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter = numbersAdapter
    }

    }


