package com.example.mvvm

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.viewmodel.MainViewModel
import com.example.mvvm.viewmodel.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.vm = ViewModelProviders
            .of(this, MainViewModelFactory(/* empty param */))
            .get(MainViewModel::class.java)

        binding.vm?.name?.observe(this, Observer { Toast.makeText(this, "ya! change to $it!", Toast.LENGTH_SHORT).show() })

    }
}
