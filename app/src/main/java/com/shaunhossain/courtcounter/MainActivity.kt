package com.shaunhossain.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBinderMapper
import androidx.databinding.DataBindingUtil
import com.shaunhossain.courtcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var scorePoints:ScorePoints = ScorePoints("0","0")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.scorePoints = scorePoints
    }
}
