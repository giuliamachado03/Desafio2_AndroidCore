package com.example.digitalhousefoods.pratos

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R
import kotlinx.android.synthetic.main.fragment_pratos_restaurante.view.*

class PratosRestauranteViewHolder (private val view : View) : RecyclerView.ViewHolder(view) {

    private val imagem = view.findViewById<ImageView>(R.id.imagePrato)
    private val nome = view.findViewById<TextView>(R.id.nomePrato)

    fun bind (prato : Prato){
        nome.text = prato.nome
        imagem.setImageDrawable(ContextCompat.getDrawable(view.context,prato.imageId))
    }

}