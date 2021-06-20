package com.jalo.bettafishsimpleapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jalo.bettafishsimpleapp.R
import com.jalo.bettafishsimpleapp.model.BettaFish

class BettaViewModel:ViewModel() {
    val bettaFishList: MutableLiveData<List<BettaFish>> by lazy {
        MutableLiveData<List<BettaFish>>()
    }

    private var bettaList: ArrayList<BettaFish>
    init {
        bettaList = ArrayList()
        getBettalists()
    }

    private fun getBettalists() {
        fechList()
        bettaFishList.value = bettaList
    }

    private fun fechList() {
        bettaList.add(BettaFish(R.drawable.bettacream,"Betta Cream","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"))
        bettaList.add(BettaFish(R.drawable.bettaloreng,"Betta Loreng","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"))
        bettaList.add(BettaFish(R.drawable.bettamerah,"Betta Red","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"))
        bettaList.add(BettaFish(R.drawable.bettaorange,"Betta Orange","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"))
        bettaList.add(BettaFish(R.drawable.bettapink,"Betta Pink","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"))
        bettaList.add(BettaFish(R.drawable.bettaputih,"Betta White","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"))
        bettaList.add(BettaFish(R.drawable.bettaungu,"Betta Purple","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"))
        bettaList.add(BettaFish(R.drawable.bettaunguhitam,"Betta Black Purple","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"))
        bettaList.add(BettaFish(R.drawable.bettaungumerah,"Betta Red Purple","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"))
        bettaList.add(BettaFish(R.drawable.bettaungumuda,"Betta Violet" ,"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,"))
    }
}