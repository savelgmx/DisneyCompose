package com.example.disneycompose.persistence


import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.disneycompose.model.Poster

@Database(entities = [Poster::class], version = 1, exportSchema = true)
abstract class AppDatabase : RoomDatabase() {

    abstract fun posterDao(): PosterDao
}