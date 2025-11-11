package com.zumbana.alvaro.cazarpatos

import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

/**
 * Unit tests for MainActivity validation logic
 */
class MainActivityTest {

    private lateinit var mainActivity: MainActivity

    @Before
    fun setup() {
        mainActivity = MainActivity()
    }

    @Test
    fun isValidEmail_withValidEmail_returnsTrue() {
        assertTrue(mainActivity.isValidEmail("test@example.com"))
        assertTrue(mainActivity.isValidEmail("user.name@domain.co"))
        assertTrue(mainActivity.isValidEmail("user+tag@example.com"))
    }

    @Test
    fun isValidEmail_withInvalidEmail_returnsFalse() {
        assertFalse(mainActivity.isValidEmail(""))
        assertFalse(mainActivity.isValidEmail("notanemail"))
        assertFalse(mainActivity.isValidEmail("@example.com"))
        assertFalse(mainActivity.isValidEmail("test@"))
        assertFalse(mainActivity.isValidEmail("test @example.com"))
    }

    @Test
    fun isValidPassword_withValidPassword_returnsTrue() {
        assertTrue(mainActivity.isValidPassword("12345678"))
        assertTrue(mainActivity.isValidPassword("password123"))
        assertTrue(mainActivity.isValidPassword("VeryLongPassword123!"))
    }

    @Test
    fun isValidPassword_withInvalidPassword_returnsFalse() {
        assertFalse(mainActivity.isValidPassword(""))
        assertFalse(mainActivity.isValidPassword("1234567"))
        assertFalse(mainActivity.isValidPassword("short"))
        assertFalse(mainActivity.isValidPassword("12345"))
    }

    @Test
    fun isValidPassword_withExactly8Characters_returnsTrue() {
        assertTrue(mainActivity.isValidPassword("abcdefgh"))
    }

    @Test
    fun isValidPassword_withLessThan8Characters_returnsFalse() {
        assertFalse(mainActivity.isValidPassword("abcdefg"))
    }
}
