package edu.iesam.loginplayground.feature.login.domain

sealed class ErrorApp : Throwable() {
    object LoginError : ErrorApp()
}

