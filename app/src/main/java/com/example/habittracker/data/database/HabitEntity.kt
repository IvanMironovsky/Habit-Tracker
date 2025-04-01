package com.example.habittracker.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "habits")
data class HabitEntity (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    @ColumnInfo(name = "goal_type") val goalType: GoalType,
    @ColumnInfo(name = "days_of_week") val daysOfWeek: List<DayOfWeek>,
    @ColumnInfo(name = "repetitions_per_day") val repetitionsPerDay: Int,
    val endDate: Date?,
    val reminderEnabled: Boolean,
    val reminderTime: List<String>?
) {
    enum class GoalType {
        TIME, QUANTITY
    }

    enum class DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}