package com.example.digitalhousefoods.restaurantes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R


class RestaurantesFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_restaurantes, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imagem1 = ResourcesCompat.getDrawable(resources, R.drawable.tony, null)

        val restaurante1 = Restaurante(
            "Tony Roma´s",
            "Av. Lavandisca, 717 - Indianópolis, São Paulo",
            "Fecha às 22:00", imagem1)

        val restaurantes = listOf<Restaurante>(restaurante1)

        val recyclerView = view.findViewById<RecyclerView>(R.id.listaRestaurante)
        val viewManager = LinearLayoutManager(context)
        val viewAdapter = RestaurantesAdapter(restaurantes)

        recyclerView.apply {
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }
    }
