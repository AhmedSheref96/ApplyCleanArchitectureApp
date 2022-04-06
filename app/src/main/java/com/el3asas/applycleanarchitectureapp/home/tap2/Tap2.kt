package com.el3asas.applycleanarchitectureapp.home.tap2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.el3asas.applycleanarchitectureapp.R
import com.el3asas.applycleanarchitectureapp.databinding.Tap2FragmentBinding
import com.el3asas.utils.binding.FragmentBinding

class Tap2 : FragmentBinding() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding<Tap2FragmentBinding>(inflater, R.layout.tap2_fragment, container).root
    }
}