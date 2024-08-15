package com.example.bookshelf.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bookshelf.model.BookList
import androidx.compose.foundation.lazy.grid.items

@Composable
fun BookGridScreen(
    bookList: BookList,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    modifier: Modifier = Modifier

) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(160.dp),
        content = {
            items (
                items = bookList.items, key = { book -> book.id }
            ) { book ->
                BookCard(
                    book = book,
                    modifier = Modifier
                        .padding(4.dp)
                        .aspectRatio(0.6f)
                )
            }
        },
        contentPadding = contentPadding,
        modifier = modifier
    )
}