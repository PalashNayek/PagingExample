package com.dac.pagingexample.retrofit

import com.dac.pagingexample.models.QuoteList
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteAPI {

    @GET("/quotes")
    suspend fun getQuotes(@Query("page") page: Int): QuoteList
}