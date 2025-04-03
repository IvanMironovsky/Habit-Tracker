package com.example.habittracker.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    version = 1,
    entities = [Habit::class]
)
abstract class HabitDatabase : RoomDatabase() {

    abstract fun getHabitDao(): HabitDao

    companion object {
        private var INSTANCE: HabitDatabase? = null
        fun getInstance(context: Context): HabitDatabase {

            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        HabitDatabase::class.java,
                        "habit_database"

                    ).fallbackToDestructiveMigration().build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}