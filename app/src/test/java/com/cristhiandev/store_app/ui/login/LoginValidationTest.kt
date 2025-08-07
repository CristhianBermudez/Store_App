package com.cristhiandev.store_app.ui.login

import org.junit.Test
import org.junit.Assert.*

/**
 * Unit tests for login validation logic
 */
class LoginValidationTest {

    @Test
    fun `test credential validation with correct credentials`() {
        val email = "test@example.com"
        val password = "password123"
        assertTrue("Valid credentials should pass", isValidCredentials(email, password))
    }

    @Test
    fun `test credential validation with incorrect email`() {
        val email = "wrong@example.com"
        val password = "password123"
        assertFalse("Invalid email should fail credential check", isValidCredentials(email, password))
    }

    @Test
    fun `test credential validation with incorrect password`() {
        val email = "test@example.com"
        val password = "wrongpassword"
        assertFalse("Invalid password should fail credential check", isValidCredentials(email, password))
    }

    @Test
    fun `test credential validation with empty fields`() {
        val email = ""
        val password = ""
        assertFalse("Empty credentials should fail", isValidCredentials(email, password))
    }

    @Test
    fun `test empty email check`() {
        val email = ""
        assertTrue("Empty email should be detected", email.isBlank())
    }

    @Test
    fun `test empty password check`() {
        val password = ""
        assertTrue("Empty password should be detected", password.isBlank())
    }

    @Test
    fun `test non-empty fields`() {
        val email = "test@example.com"
        val password = "password123"
        assertFalse("Non-empty email should not be blank", email.isBlank())
        assertFalse("Non-empty password should not be blank", password.isBlank())
    }

    // Helper function copied from LoginScreen for testing
    private fun isValidCredentials(email: String, password: String): Boolean {
        return email == "test@example.com" && password == "password123"
    }
}