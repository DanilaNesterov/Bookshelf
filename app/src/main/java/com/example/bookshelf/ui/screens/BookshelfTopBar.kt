package com.example.bookshelf.ui.screens

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.bookshelf.R
import com.example.bookshelf.ui.theme.BookshelfTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookshelfTopBar(
    modifier: Modifier = Modifier
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.app_name),
                color = Color.White,
                fontSize = 24.sp
            )
                },
        colors = TopAppBarDefaults.topAppBarColors(Color(0xFF9B4425)),
        modifier = modifier
    )
}


@Composable
@Preview(showBackground = true)
fun BookshelfTopBarPreview() {
    BookshelfTheme {
        BookshelfTopBar()
    }
}