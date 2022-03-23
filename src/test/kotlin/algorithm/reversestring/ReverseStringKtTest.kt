package algorithm.reversestring

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class ReverseStringKtTest{
    companion object {
        @JvmStatic
        fun data() = listOf(
            of(charArrayOf('a'), charArrayOf('a')),
            of(charArrayOf('a','a'), charArrayOf('a','a')),
            of(charArrayOf('a','b'), charArrayOf('b','a')),
            of(charArrayOf('a','b', 'c'), charArrayOf('c', 'b','a'))
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `test reverse string`(charArr: CharArray, expected: CharArray) {
        reverseString(charArr)
        assertArrayEquals(expected, charArr)
    }
}