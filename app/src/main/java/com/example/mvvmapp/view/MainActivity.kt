package com.example.mvvmapp.view

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmapp.R
import com.example.mvvmapp.viewmodel.ListViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel:ListViewModel
    var context:Context?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // viewModel = ViewModelProviders.of(this.applicationContext).get(ListViewModel::class.java)
    }
}

