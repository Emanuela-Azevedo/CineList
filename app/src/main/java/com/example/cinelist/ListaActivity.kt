package com.example.cinelist

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_lista)

        val listView = findViewById<ListView>(R.id.listView)

        val categoria = intent.getStringExtra("categoria")

        val lista = if (categoria == "filmes") {

            arrayOf(
                "🎬 Interestelar",
                "🦇 Batman",
                "🛡️ Vingadores"
            )

        } else {

            arrayOf(
                "🌑 Dark",
                "🧪 Breaking Bad",
                "👾 Stranger Things"
            )
        }

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            lista
        )

        listView.adapter = adapter
    }
}