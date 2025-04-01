package com.example.habittracker.data.repository

import com.example.habittracker.data.database.HabitDao
import com.example.habittracker.data.database.Habit
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class HabitRepository(private val habitDao: HabitDao) {
    val allHabits: List<Habit> = habitDao.getAllHabits()

    suspend fun insert(habitEntity: Habit) {
        withContext(Dispatchers.IO) {
            habitDao.insertHabit(habitEntity)
        }
    }

    suspend fun update(habit: Habit) {
        withContext(Dispatchers.IO) {
            habitDao.updateHabit(habit)
        }
    }

    suspend fun delete(habit: Habit) {
        withContext(Dispatchers.IO) {
            habitDao.deleteHabitById(habit.id)
        }
    }

    suspend fun getHabitById(id: Int): Habit? {
        return withContext(Dispatchers.IO) {
            return@withContext habitDao.getHabitById(id)
        }
    }
}