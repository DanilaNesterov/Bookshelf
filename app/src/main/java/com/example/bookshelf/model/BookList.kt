package com.example.bookshelf.model

import kotlinx.serialization.Serializable


@Serializable
data class BookList(
    val items: List<Item>,
)
