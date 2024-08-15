package com.example.bookshelf.network

import com.example.bookshelf.model.BookList
import retrofit2.http.GET

interface BookshelfApiService {
    @GET("?q=jazz+history")
    suspend fun getBookList(): BookList
}