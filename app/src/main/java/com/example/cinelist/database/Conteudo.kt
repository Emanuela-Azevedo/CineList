package com.example.cinelist.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "conteudos")
data class Conteudo(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val titulo: String,

    val categoria: String,

    val ano: Int,

    val avaliacao: Float
)