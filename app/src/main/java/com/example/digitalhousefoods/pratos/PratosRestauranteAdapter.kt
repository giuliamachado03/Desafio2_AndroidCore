package com.example.digitalhousefoods.pratos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.restaurantes.Restaurante
import com.example.digitalhousefoods.restaurantes.RestaurantesAdapter

class PratosRestauranteAdapter(private val dataset: List<Prato>) :
    RecyclerView.Adapter<PratosRestauranteAdapter.MeuViewHolder>() {

    class MeuViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val imagem_prato by lazy {
            view.findViewById(R.id.imagePrato) as ImageView
        }

        private val nome_prato by lazy {
            view.findViewById(R.id.nomePrato) as TextView
        }

        fun bind (prato: Prato) {

            imagem_prato.setImageResource(R.drawable.prato)
            nome_prato.text = prato.nome

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lista_pratos, parent, false)

        return MeuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
        holder.bind(dataset[position])
        val item = dataset[position]
    }

    override fun getItemCount() = dataset.size

}
