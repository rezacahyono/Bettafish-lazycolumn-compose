package com.jalo.bettafishsimpleapp

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.jalo.bettafishsimpleapp.model.BettaFish
import com.jalo.bettafishsimpleapp.ui.theme.BettafishSimpleAppTheme
import com.jalo.bettafishsimpleapp.uitel.bettaCard
import com.jalo.bettafishsimpleapp.viewmodel.BettaViewModel

class MainActivity : ComponentActivity() {
    private val bettaViewModel: BettaViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BettafishSimpleAppTheme {
                val bettaLists = bettaViewModel.bettaFishList.value
                setBettaList(bettaList = bettaLists!!, context = this)
            }
        }
    }
}

@Composable
fun setBettaList(bettaList: List<BettaFish>,context: Context) {
    LazyColumn {
        itemsIndexed(items = bettaList) {index,itemBetta ->
            bettaCard(bettaFish = itemBetta, onClick = {
                Toast.makeText(context,itemBetta.bettaName,Toast.LENGTH_SHORT).show()
            })
        }
        
    }

}


@Preview
@Composable
fun setBettaView() {

}