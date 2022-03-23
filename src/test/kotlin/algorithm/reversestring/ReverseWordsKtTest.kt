package algorithm.reversestring

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class ReverseWordsKtTest {
    companion object {
        @JvmStatic
        fun data() = listOf(
            of("dog", "god"),
            of("Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc"),
            of("God Ding", "doG gniD")
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `test reverse words`(s: String, expected: String) {
        assertEquals(expected, reverseWords(s))
    }
}