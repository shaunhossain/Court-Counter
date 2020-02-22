package com.shaunhossain.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBinderMapper
import androidx.databinding.DataBindingUtil
import com.shaunhossain.courtcounter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var scorePoints:ScorePoints = ScorePoints("0","0")
    private var scorePointsNumberA:Int = 0
    private var scorePointsNumberB:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.scorePoints = scorePoints

        //For team A button
        binding.maxPointAButton.setOnClickListener{
            AddMaxScoreA()
        }
        binding.minPointAButton.setOnClickListener{
            AddMinScoreA()
        }
        binding.averagePointAButton.setOnClickListener{
            AddAverageScoreA()
        }

        //For team B button
        binding.maxPointBButton.setOnClickListener {
            AddMaxScoreB()
        }
        binding.minPointBButton.setOnClickListener {
            AddMinScoreB()
        }
        binding.averagePointBButton.setOnClickListener {
            AddAverageScoreB()
        }

        //Reset the score point
        binding.resetButton.setOnClickListener {
           ResetScore()
        }
    }

    //Function to add score for team A
    private fun AddMaxScoreA(){
        scorePointsNumberA = scorePointsNumberA + 3
        binding.scorePoints = ScorePoints(scorePointsNumberA.toString(),scorePointsNumberB.toString())
    }
    private fun AddMinScoreA(){
        scorePointsNumberA = scorePointsNumberA + 2
        binding.scorePoints = ScorePoints(scorePointsNumberA.toString(),scorePointsNumberB.toString())
    }
    private fun AddAverageScoreA(){
        scorePointsNumberA = scorePointsNumberA + 1
        binding.scorePoints = ScorePoints(scorePointsNumberA.toString(),scorePointsNumberB.toString())
    }

    //Function to add score for team B
    private fun AddMaxScoreB(){
        scorePointsNumberB = scorePointsNumberB + 3
        binding.scorePoints = ScorePoints(scorePointsNumberA.toString(),scorePointsNumberB.toString())
    }
    private fun AddMinScoreB(){
        scorePointsNumberB = scorePointsNumberB + 2
        binding.scorePoints = ScorePoints(scorePointsNumberA.toString(),scorePointsNumberB.toString())
    }
    private fun AddAverageScoreB(){
        scorePointsNumberB = scorePointsNumberB + 1
        binding.scorePoints = ScorePoints(scorePointsNumberA.toString(),scorePointsNumberB.toString())
    }

    //To reset the current value
    private fun ResetScore(){
        scorePointsNumberA = 0
        scorePointsNumberB = 0
        binding.scorePoints = ScorePoints(scorePointsNumberA.toString(),scorePointsNumberB.toString())
    }
}
