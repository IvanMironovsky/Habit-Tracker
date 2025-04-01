package com.example.habittracker.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    version = 1,
    entities = [Habit::class]
)
abstract class HabitDatabase : RoomDatabase() {

    abstract fun getHabitDao(): HabitDao

    companion object {
        const val DATABASE_NAME = "habit_tracker_db"
    }
}