package com.valenzuela.ganadorteam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.valenzuela.ganadorteam.databinding.FragmentTeamBBinding


class teamBFragment : Fragment() {

    private lateinit var binding: FragmentTeamBBinding
    private val scoreViewModel:MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_team_b,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = scoreViewModel
        binding.lifecycleOwner = this

        binding.buttonGolB.setOnClickListener{
            scoreViewModel.teamBScore.setValue((scoreViewModel.teamBScore.value!!.toInt() + 1).toString())
        }
    }


}