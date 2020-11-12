package com.example.digitalhousefoods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.pratos.Prato

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun criarLista (prato: Prato){
        val recyclerView = findViewById<RecyclerView>(R.id.listaPratos)
        val manager = GridLayoutManager(this, 2)
    }
}