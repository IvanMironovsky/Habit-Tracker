package com.example.habittracker.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface HabitDao {
    @Query("SELECT * FROM habits")
    fun getAllHabits(): List<Habit>

    @Query("SELECT * FROM habits WHERE id = :id")
    fun getHabitById(id: Int): Habit?

    @Insert
    fun insertHabit(habit: Habit)

    @Update
    fun updateHabit(habit: Habit)

    @Query("DELETE FROM habits WHERE id = :id")
    fun deleteHabitById(id: Int)
}