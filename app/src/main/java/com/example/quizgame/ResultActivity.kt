package com.example.quizgame

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quizgame.databinding.ActivityResultBinding

class ResultActivity:  AppCompatActivity() {
        private lateinit var binding: ActivityResultBinding

        @SuppressLint("SetTextI18n")
override fun onCreate(savedInstanceState: Bundle?){
                super.onCreate(savedInstanceState)
                binding = ActivityResultBinding.inflate(layoutInflater)
                val view = binding.root
                setContentView(view)

                val correctAnswersCount = intent.getIntExtra("score", 0)
                binding.tvResult.text
        }
}