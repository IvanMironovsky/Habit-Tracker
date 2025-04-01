package com.example.habittracker.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    version = 1,
    entities = [HabitEntity::class]
)
abstract class HabitDatabase : RoomDatabase() {

    abstract fun getHabitDao(): HabitDao
}