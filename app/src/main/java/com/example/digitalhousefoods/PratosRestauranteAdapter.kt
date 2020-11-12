package com.example.digitalhousefoods

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.pratos.Prato
import com.example.digitalhousefoods.pratos.PratosRestauranteViewHolder

class PratosRestauranteAdapter(
    private val dataset: List<Prato>,
    private val listener: (Prato) -> Unit
) : RecyclerView.Adapter<PratosRestauranteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratosRestauranteViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_lista_pratos, parent, false)
        return PratosRestauranteViewHolder(view)
    }


    override fun onBindViewHolder(holder: PratosRestauranteViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { listener(item) }
    }

    override fun getItemCount() = dataset.size

}
