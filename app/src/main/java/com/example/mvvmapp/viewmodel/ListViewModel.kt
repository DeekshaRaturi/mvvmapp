package com.example.mvvmapp.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.mvvmapp.model.Country

class ListViewModel :ViewModel(){

    val countries= MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh(){

        fetchCountries()


    }

    fun fetchCountries(){

        val mockData = listOf(Country("countryA"), Country("countryB"),
            Country("countryC"),Country("countryD"),Country("countryE"),Country("countryF")
            ,Country("countryG"),Country("countryH"),Country("countryI"))

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData


    }
}