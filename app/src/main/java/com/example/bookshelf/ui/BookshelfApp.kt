package com.example.bookshelf.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bookshelf.ui.screens.BookshelfTopBar
import com.example.bookshelf.ui.screens.BookshelfViewModel
import com.example.bookshelf.ui.screens.HomeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookshelfApp() {
    Scaffold(
        topBar = { BookshelfTopBar() }
    ) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            val bookshelfViewModel: BookshelfViewModel = viewModel(factory = BookshelfViewModel.Factory)

            HomeScreen(
                bookshelfUiState = bookshelfViewModel.uiState,
                retryAction = bookshelfViewModel::getBookList,
                contentPadding = it
            )
        }
    }
}