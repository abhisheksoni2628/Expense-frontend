package com.abhishek.em.utils

sealed class Network<T> {
    class Loading<T> : Network<T>()
    data class Success<T>(val data: T) : Network<T>()
    data class Error<T>(val message: String) : Network<T>()
}