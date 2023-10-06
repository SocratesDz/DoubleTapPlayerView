package com.github.vkay94.doubletapplayerviewexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.vkay94.doubletapplayerviewexample.databinding.ActivityFirstBinding

class FirstActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mainButton.setOnClickListener {
            startActivity(BaseVideoActivity.newIntent(this, MainActivity::class.java))
        }
    }
}