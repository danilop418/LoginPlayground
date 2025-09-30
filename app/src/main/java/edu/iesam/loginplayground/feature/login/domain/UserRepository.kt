package edu.iesam.loginplayground.feature.login.domain

interface UserRepository {

    fun getPassword(username:String):String
    fun getUser(username: String):User

}