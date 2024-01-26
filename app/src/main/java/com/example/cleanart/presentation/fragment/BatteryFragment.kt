package com.example.cleanart.presentation.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.cleanart.R
import com.example.cleanart.databinding.FragmentBatteryBinding
import com.example.cleanart.presentation.viewmodel.BatteryViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class BatteryFragment : Fragment() {
    lateinit var viewModel: BatteryViewModel
    lateinit var binding:FragmentBatteryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding=FragmentBatteryBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=ViewModelProvider(this)[BatteryViewModel::class.java]


        lifecycleScope.launch {
            viewModel.gettingCategory()
            Log.i("DataCheck", "onViewCreated: ${viewModel.gettingCategory()}")
        }

        lifecycleScope.launch {
            viewModel.postCategories()
        }
    }



}