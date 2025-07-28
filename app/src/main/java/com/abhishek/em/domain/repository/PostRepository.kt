package com.abhishek.em.domain.repository

import com.abhishek.em.domain.model.PostDto
import com.abhishek.em.utils.Network
import kotlinx.coroutines.flow.Flow

interface PostRepository {
    suspend fun getPosts(): Flow<Network<List<PostDto>>>
}