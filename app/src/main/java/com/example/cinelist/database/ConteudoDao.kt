package com.example.cinelist.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ConteudoDao {

    @Insert
    suspend fun inserir(conteudo: Conteudo): Long

    @Update
    suspend fun atualizar(conteudo: Conteudo)

    @Delete
    suspend fun deletar(conteudo: Conteudo)

    @Query("SELECT * FROM conteudos")
    suspend fun listarTodos(): List<Conteudo>

    @Query("SELECT * FROM conteudos WHERE categoria = :categoria")
    suspend fun listarPorCategoria(categoria: String): List<Conteudo>

    @Query("SELECT * FROM conteudos WHERE id = :id")
    suspend fun buscarPorId(id: Int): Conteudo?
}