package com.example.lesson3_6

import MusicAdapter
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson3_6.databinding.ActivityMainBinding
import com.example.lesson3_6.databinding.FragmentMusicListBinding


class MusicListFragment : Fragment() {

    private lateinit var binding: FragmentMusicListBinding
    private var musicList = arrayListOf<Music>(
        Music("Alone Again", "The Weekend", "1 234 768 345", "4:10"),
        Music("Blinding Light", "The Weekend", "2 834 987 000", "3:20"),
        Music("Escape from LA", "The Weekend", "2 834 987 000", "5:56"),
        Music("Save Your Tears", "The Weekend", "3 769 345 233", "3:36"),
        Music("Scared to Love", "The Weekend", "769 345 233", "3:11"),
        Music("Faith", "The Weekend", "943 522 233", "4:43"),
        Music("Until I Bleed Out", "The Weekend", "777 643 231", "3:10"),
        Music("Too Late", "The Weekend", "987 643 111", "3:55"),
        Music("In Your Eyes", "The Weekend", "4 987 643 111", "3:58"),
        Music("Hardest to Love", "The Weekend", "443 987", "3:31"),
        Music("Heartless", "The Weekend", "1 645 789 537", "3:18"),
        Music("Snowchild", "The Weekend", "678 999", "4:07"),
        Music("After Hours", "The Weekend", "5 987 678 999", "6:24"),

    )
    private var bundle = Bundle()
    private var fragment:DetailFragment = DetailFragment()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicListBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = MusicAdapter(musicList,this::onItemClick)
        binding.rvMusic.adapter = adapter

    }

    private fun onItemClick(i: Int) {
        bundle.putSerializable("music", musicList[i])
        fragment.arguments = bundle

        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.detail_container,fragment).addToBackStack(null).commit()
    }

}