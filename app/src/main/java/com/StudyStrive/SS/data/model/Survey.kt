package com.StudyStrive.SS.data.model

data class Survey(
    val id: Long = 0,
    val name: String,
    val description: String = "",
    val questionCount: Int = 0,
    val dateCreated: Long = System.currentTimeMillis()
) 