package com.el3asas.applycleanarchitectureapp.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.el3asas.applycleanarchitectureapp.R
import com.el3asas.applycleanarchitectureapp.databinding.HomeFragmentBinding
import com.el3asas.utils.binding.FragmentBinding
import com.el3asas.utils.utils.navigate
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

            val navHost =
                childFragmentManager.findFragmentById(R.id.home_nav_host) as NavHostFragment
            val navController = navHost.navController
            tap1.setOnClickListener {
                if (navController.currentDestination?.id == R.id.tap2_nav)
                    navigate(navController, R.id.action_tap2_nav_to_tap1_nav, null, null, null)
            }

            tap2.setOnClickListener {
                if (navController.currentDestination?.id == R.id.tap1_nav)
                    navigate(navController, R.id.action_tap1_nav_to_tap2_nav, null, null, null)
            }

        }.root
    }
}