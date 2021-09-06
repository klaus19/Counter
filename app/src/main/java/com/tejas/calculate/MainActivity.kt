package com.tejas.calculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tejas.calculate.databinding.ActivityMainBinding
import com.tejas.model.CalculatorViewModel

class MainActivity : AppCompatActivity(), LifecycleOwner {

    private lateinit var binding:ActivityMainBinding // viewBinding the Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        binding.root.apply {
             setContentView(this)
        }


        var viewModel=ViewModelProvider(this).get(CalculatorViewModel::class.java)

        binding.txtCount.text=viewModel.number.toString()

        binding.btnCount.setOnClickListener {
              viewModel.addNumber()

            binding.txtCount.text=viewModel.number.toString()

        }



    }
}