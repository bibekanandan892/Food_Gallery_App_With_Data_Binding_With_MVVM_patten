package com.example.recyclerviewwithretrofitapi

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.recyclerviewwithretrofitapi.databinding.ActivityMainBinding
import com.example.recyclerviewwithretrofitapi.databinding.CardviewBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        val recyclerViewNews= binding.rvNews
        val largeNews =
        val newsAdapter = AdapterForRecycler
    }
}