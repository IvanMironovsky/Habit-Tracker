package com.example.habittracker

import android.content.Context
import androidx.room.Room
import com.example.habittracker.data.database.HabitDatabase

object Dependencies {

    private lateinit var applicationContext: Context

    fun init(context: Context) {
        applicationContext = context
    }

    private val appDatabase: HabitDatabase by lazy {
        Room.databaseBuilder(applicationContext, HabitDatabase::class.java, "habit_tracker.db")
            .build()
    }
}