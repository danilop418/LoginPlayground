package edu.iesam.loginplayground.feature.login.domain

class SignInUseCase(private val userRepository: UserRepository) {

    operator fun invoke(username: String, password: String): Result<User> {
        val user = userRepository.getUser(username)
        if (user.password == password) {
            return Result.success(user)
        } else {
            return Result.failure(ErrorApp.LoginError)
        }
    }

}