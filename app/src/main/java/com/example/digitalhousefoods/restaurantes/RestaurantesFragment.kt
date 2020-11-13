package com.example.digitalhousefoods.restaurantes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R


class RestaurantesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
        return inflater.inflate(R.layout.fragment_restaurantes, container, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController: NavController = Navigation.findNavController(view)
        val restaurantes = criarRestaurantes()
        val recyclerView = view.findViewById<RecyclerView>(R.id.restaurantesFragment)

        val meuAdapter = RestaurantesAdapter(restaurantes as MutableList<Restaurante>) {
            val bundle = bundleOf("nome" to it.nome, "imagem" to it.imagem)
            navController.navigate(
                R.id.action_pratosRestauranteFragment_to_detalhePratoFragment,
                bundle
            )
        }

        val manager = LinearLayoutManager(context)
        recyclerView.adapter = meuAdapter
        recyclerView.layoutManager = manager
    }

    fun criarRestaurantes(): List<Restaurante> {


        val restaurantes = mutableListOf(
            Restaurante(
                "Tony Roma´s",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "Fecha às 22:00",
                R.drawable.tony
            ), Restaurante(
                "Tony Roma´s",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "Fecha às 22:00",
                R.drawable.tony
            ),
            Restaurante(
                "Tony Roma´s",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "Fecha às 22:00",
                R.drawable.tony
            )
        )

        return restaurantes
    }
}
