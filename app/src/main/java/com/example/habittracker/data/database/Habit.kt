package com.example.habittracker.data.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "habits")
data class Habit (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    @ColumnInfo(name = "goal_type") val goalType: GoalType,
    @ColumnInfo(name = "days_of_week") val daysOfWeek: List<DayOfWeek>,
    @ColumnInfo(name = "repetitions_per_day") val repetitionsPerDay: Int,
    @ColumnInfo(name = "end_date") val endDate: Date?,
    @ColumnInfo(name = "reminder_enabled") val reminderEnabled: Boolean,
    @ColumnInfo(name = "reminder_time") val reminderTime: List<String>?
) {
    enum class GoalType {
        TIME, QUANTITY
    }

    enum class DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}