package com.example.digitalhousefoods.restaurantes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R

class RestaurantesAdapter(
    private val dataset: List<Restaurante>
) : RecyclerView.Adapter<RestaurantesAdapter.MeuViewHolder>() {

    class MeuViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val imagem_restaurante by lazy {
            view.findViewById(R.id.imageRestaurante) as ImageView
        }

        private val nome_restaurante by lazy {
            view.findViewById(R.id.nomeRestaurante) as TextView
        }

        private val endereco_restaurante by lazy {
            view.findViewById(R.id.enderecoRestaurante) as TextView
        }

        private val horario_restaurante by lazy {
            view.findViewById(R.id.horarioFucRestaurante) as TextView
        }

        fun bind(restaurante: Restaurante) {
            imagem_restaurante.setImageResource(R.drawable.tony)
            nome_restaurante.text = restaurante.nome
            endereco_restaurante.text = restaurante.endereco
            horario_restaurante.text = restaurante.horarioFunc

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MeuViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lista_restaurante, parent, false)

        return MeuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MeuViewHolder, position: Int) {
        val item = dataset[position]
        holder.bind(dataset[position])
    }

    override fun getItemCount() = dataset.size

}
