package com.example.cinelist.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Conteudo::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun conteudoDao(): ConteudoDao
}