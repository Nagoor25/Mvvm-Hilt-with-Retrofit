package com.example.mvvmhiltdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmhiltdemo.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)*/
    }
}