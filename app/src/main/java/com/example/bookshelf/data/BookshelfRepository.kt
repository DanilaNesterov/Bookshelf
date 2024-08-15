package com.example.bookshelf.data

import com.example.bookshelf.model.BookList
import com.example.bookshelf.network.BookshelfApiService

interface BookshelfRepository {
    suspend fun getBookList(): BookList
}

class NetworkBookshelfRepository(
    private val bookshelfApiService: BookshelfApiService
): BookshelfRepository {
    override suspend fun getBookList(): BookList = bookshelfApiService.getBookList()

}