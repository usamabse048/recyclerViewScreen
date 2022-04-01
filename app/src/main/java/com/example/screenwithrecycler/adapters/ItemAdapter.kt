package com.example.screenwithrecycler.adapters

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.screenwithrecycler.R
import com.example.screenwithrecycler.models.RecyclerItemModel

class ItemAdapter(
    val context: Context,
    val items: ArrayList<RecyclerItemModel>
) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val myTextView: TextView
        val myImgView: ImageView

        init {
            // Define click listener for the ViewHolder's View.

            myTextView = view.findViewById(R.id.myTextView)
            myImgView = view.findViewById(R.id.myImgView)
        }

        fun bind(item: RecyclerItemModel) {

        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.myTextView.text = items[position].bottomText
        holder.myImgView.setImageURI(Uri.parse(items[position].imgPath))

        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_card, parent, false)
        return ViewHolder(view)
    }
}