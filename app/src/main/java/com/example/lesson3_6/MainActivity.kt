package com.example.lesson3_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lesson3_6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportFragmentManager.beginTransaction().add(R.id.poster_container,PosterFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.music_container,MusicListFragment()).commit()
    }
}