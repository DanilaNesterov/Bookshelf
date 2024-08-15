package com.example.bookshelf.model

import kotlinx.serialization.Serializable

@Serializable
data class VolumeInfo(
    val title: String,
    val authors: List<String>,
    val imageLinks: ImageLinks
)
