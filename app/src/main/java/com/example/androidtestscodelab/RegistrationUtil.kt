package com.example.androidtestscodelab


object RegistrationUtil {
    private val userList = listOf("nuoraldin", "Mohamed", "adani")


    /**
     * ## the input is not valid if.
     * ### 1: the username/password is empty
     * ### 2: the username is already taken
     * ### 3: the confirmed password is not the same as the real password
     * ### 4: the password contains less than tow digits
     **/
    fun validateRegistrationInput(username: String, password: String, confirmedPassword: String): Boolean {


        if(username.isEmpty() || password.isEmpty()){
            return false
        }
        if(username in userList) {
            return false
        }
        if (password.count { it.isDigit() } < 2){
            return false
        }
        if (password != confirmedPassword){
            return false
        }
        return true
    }
}