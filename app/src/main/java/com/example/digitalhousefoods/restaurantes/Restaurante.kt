package com.example.digitalhousefoods.restaurantes

import com.example.digitalhousefoods.pratos.Prato

class Restaurante(
    val nome: String,
    val imageId: Int,
    val endereco: String,
    val horarioFunc: String,
    val pratos: List<Prato>

) {
}