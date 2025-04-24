package com.StudyStrive.SS.data.model

data class History(
    val id: Long = 0,
    val name: String,
    val type: HistoryType,
    val score: Int = 0,
    val dateCompleted: Long = System.currentTimeMillis()
)

enum class HistoryType {
    SURVEY, CARD_SET
} 