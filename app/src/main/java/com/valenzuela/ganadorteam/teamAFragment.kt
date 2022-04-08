package com.valenzuela.ganadorteam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.valenzuela.ganadorteam.databinding.FragmentTeamABinding


class teamAFragment : Fragment() {
    private lateinit var binding: FragmentTeamABinding
    private val scoreViewModel:MainViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_team_a,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = scoreViewModel
        binding.lifecycleOwner = this

        binding.buttonGolA.setOnClickListener{
            scoreViewModel.teamAScore.setValue((scoreViewModel.teamAScore.value!!.toInt() + 1).toString())
        }
    }

}