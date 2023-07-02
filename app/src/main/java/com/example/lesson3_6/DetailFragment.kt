package com.example.lesson3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lesson3_6.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    private lateinit var musicInfo: Music
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        musicInfo = arguments?.getSerializable("music") as Music
        binding.tvMusicDetailName.text =musicInfo.name
        binding.tvAuthorDetailName.text = musicInfo.author
        binding.tvMusicDetailDuration.text = musicInfo.duration
    }

}
