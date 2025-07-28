package com.abhishek.em.data.remote

import com.abhishek.em.domain.model.PostDto
import retrofit2.http.GET

interface ApiService {
    @GET("/posts")
    suspend fun getPosts(): List<PostDto>
}