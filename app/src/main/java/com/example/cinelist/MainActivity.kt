package com.example.cinelist

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btnFilmes = findViewById<Button>(R.id.btnFilmes)
        val btnSeries = findViewById<Button>(R.id.btnSeries)

        btnFilmes.setOnClickListener {

            val intent = Intent(
                this,
                ListaActivity::class.java
            )

            intent.putExtra(
                "categoria",
                "filmes"
            )

            startActivity(intent)
        }

        btnSeries.setOnClickListener {

            val intent = Intent(
                this,
                ListaActivity::class.java
            )

            intent.putExtra(
                "categoria",
                "series"
            )

            startActivity(intent)
        }
    }
}