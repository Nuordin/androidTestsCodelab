package com.example.androidtestscodelab

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        assertThat(
            RegistrationUtil.validateRegistrationInput(
                username = "", password = "123", confirmedPassword = "123"
            )
        ).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        assertThat(
            RegistrationUtil.validateRegistrationInput(
                username = "ahmed", password = "", confirmedPassword = ""
            )
        ).isFalse()
    }

    @Test
    fun `valid username already exist returns false`() {
        assertThat(
            RegistrationUtil.validateRegistrationInput(
                username = "nuoraldin", password = "123", confirmedPassword = "123"
            )
        ).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        assertThat(
            RegistrationUtil.validateRegistrationInput(
                username = "salman", password = "123", confirmedPassword = "123"
            )
        ).isTrue()
    }

    @Test
    fun `invalid password returns false`() {
        assertThat(
            RegistrationUtil.validateRegistrationInput(
                username = "nuoraldin", password = "some", confirmedPassword = "some"
            )
        ).isFalse()
    }

    @Test
    fun `valid user name and incorrectly repeated password returns false`() {
        assertThat(
            RegistrationUtil.validateRegistrationInput(
                username = "salman", password = "321", confirmedPassword = "123"
            )
        ).isFalse()
    }
}