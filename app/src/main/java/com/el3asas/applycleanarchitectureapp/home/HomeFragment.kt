package com.el3asas.applycleanarchitectureapp.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.el3asas.applycleanarchitectureapp.R
import com.el3asas.applycleanarchitectureapp.databinding.HomeFragmentBinding
import com.el3asas.utils.binding.FragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : FragmentBinding() {
    private val viewModel by viewModels<HomeViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding<HomeFragmentBinding>(inflater, R.layout.home_fragment, container).apply {
            viewModel = this@HomeFragment.viewModel
            lifecycleOwner = this@HomeFragment
            executePendingBindings()
        }.root
    }
}