package com.example.digitalhousefoods.restaurantes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R

class RestaurantesAdapter(
    private val dataset: List<Restaurante>,
    private val listener: (Restaurante) -> Unit
) : RecyclerView.Adapter<RestaurantesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantesViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lista_restaurante, parent, false)
        return RestaurantesViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantesViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount() = dataset.size
    }
