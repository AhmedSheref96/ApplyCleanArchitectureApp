package com.el3asas.applycleanarchitectureapp.home.tap1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.el3asas.applycleanarchitectureapp.R
import com.el3asas.applycleanarchitectureapp.databinding.Tap1FragmentBinding
import com.el3asas.utils.binding.FragmentBinding

class Tap1 : FragmentBinding() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding<Tap1FragmentBinding>(inflater, R.layout.tap1_fragment, container).root
    }
}