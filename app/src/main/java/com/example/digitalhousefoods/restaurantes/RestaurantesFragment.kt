package com.example.digitalhousefoods.restaurantes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.view.size
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.pratos.Prato
import kotlinx.android.synthetic.main.fragment_restaurantes.*
import kotlinx.android.synthetic.main.item_lista_restaurante.*


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

        val navController = Navigation.findNavController(view)

        //val restaurante1 = Restaurante("nome",0, "endereco", "horario", List<Prato> )

       // val restaurantes = List<Restaurante>

        val recyclerView = view.findViewById<RecyclerView>(R.id.listaRestaurante)
        val viewManager = LinearLayoutManager(context)

        // viewAdapter = RestaurantesAdapter(restaurantes)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            // adapter =
        }



    }

}