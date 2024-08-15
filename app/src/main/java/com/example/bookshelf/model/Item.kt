package com.example.bookshelf.model

import kotlinx.serialization.Serializable

@Serializable
data class Item(
    val id: String,
    val volumeInfo: VolumeInfo
)
