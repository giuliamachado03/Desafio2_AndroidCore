package com.example.digitalhousefoods.restaurantes

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.pratos.Prato
import com.example.digitalhousefoods.pratos.PratosRestauranteViewHolder
import kotlinx.android.synthetic.main.item_lista_pratos.view.*

class RestaurantesViewHolder (private val view : View) : RecyclerView.ViewHolder(view) {

    private val nome = view.findViewById<TextView>(R.id.nomeRestaurante)
    private val endereco = view.findViewById<TextView>(R.id.enderecoRestaurante)
    private val horarioFun = view.findViewById<TextView>(R.id.horarioFucRestaurante)
    private val imagem =view.findViewById<ImageView>(R.id.imageRestaurante)

    fun bind (restaurante: Restaurante){
        nome.text = restaurante.nome
        endereco.text = restaurante.endereco
        horarioFun.text = restaurante.horarioFunc
        imagem.setImageDrawable(ContextCompat.getDrawable(view.context,restaurante.imageId))
    }

}