package com.example.mvvmapp.view

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvvmapp.R
import com.example.mvvmapp.model.Country
import kotlinx.android.synthetic.main.item_country.view.*
import java.text.FieldPosition

class CountryListAdapter(var countries:ArrayList<Country>):RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {

    fun updateCountries(newCountries:List<Country>){

        countries.clear()
        countries.addAll(newCountries)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int) = CountryViewHolder(LayoutInflater.from(p0.context).inflate(
        R.layout.item_country,p0,false))

    override fun getItemCount(): Int = countries.size


    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {

     holder.bing(countries[position])

    }

    class CountryViewHolder(view:View):RecyclerView.ViewHolder(view){

        val countryname = view.name

    fun bing(country: Country){

        countryname.text = country.countryname



    }
}

}
