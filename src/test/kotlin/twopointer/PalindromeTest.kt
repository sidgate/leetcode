package twopointer

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class PalindromeTest {
    companion object{
        @JvmStatic
        fun data() = listOf(
            of("mam", true),
            of("A man, a plan, a canal: Panama", true),
            of("race a car", false),
            of(" ", true),
            of(" a a ", true),
            of("a", true)
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun testPalindrome(input: String, expected: Boolean){
        assertEquals(expected, isPalindrome(input))
    }
}

fun isPalindrome(s: String): Boolean {

    if(s.isEmpty()) return true
    var start = 0
    var end = s.length-1
    while (start < end){
        if (s[start].isLetterOrDigit()) {
            if (s[end].isLetterOrDigit()) {
                if (s[end].equals(s[start], true)) {
                    start++
                    end--
                } else return false
            } else end--
        } else start++
    }
    return true
}