package com.example.screenwithrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.screenwithrecycler.adapters.ItemAdapter
import com.example.screenwithrecycler.models.RecyclerItemModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recycler: RecyclerView = findViewById(R.id.myRecyclerView)
        recycler.layoutManager = GridLayoutManager(this,3)
        val itemAdapter = ItemAdapter(this, getListOfItems())
        recycler.adapter = itemAdapter

        val name: String? = null
        name?.let {
            takeName(it)
        }

        //LiveData
        //Coroutines
        //MVVM
    }

    private fun takeName(name: String) {

    }

    private fun getListOfItems(): ArrayList<RecyclerItemModel> {
        val arrayList = ArrayList<RecyclerItemModel>()

        repeat(12) {
            arrayList.add(
                RecyclerItemModel(
                    bottomText = "name",
                    imgPath = "android.resource://com.example.screenwithrecycler/drawable/ic_mobile_topup"
                )
            )
        }

        return arrayList
    }
}