package com.example.bookshelf.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.bookshelf.R
import com.example.bookshelf.ui.theme.BookshelfTheme

@Composable
fun LoadingScreen(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = R.drawable.loading_img),
        contentDescription = null,
        modifier = modifier
    )

}

@Composable
@Preview(showBackground = true)
fun LoadingScreenPreview() {
    BookshelfTheme {
        LoadingScreen(
            modifier = Modifier.fillMaxSize()
        )
    }
}
