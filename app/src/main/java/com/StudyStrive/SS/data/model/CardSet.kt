package com.StudyStrive.SS.data.model

data class CardSet(
    val id: Long = 0,
    val name: String,
    val description: String = "",
    val cardCount: Int = 0,
    val dateCreated: Long = System.currentTimeMillis(),
    val cardSide: CardSide = CardSide.MIXED
)

enum class CardSide {
    SIDE_A, SIDE_B, MIXED
} 