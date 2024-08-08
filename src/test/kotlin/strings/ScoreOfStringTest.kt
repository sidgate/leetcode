package strings

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import kotlin.math.abs
import kotlin.test.assertEquals

class ScoreOfStringTest {
    companion object{
        @JvmStatic
        fun data() = listOf(
            of("hello", 13),
            of("zaz", 50),

        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun testScore(input: String, expected: Int){

        assertEquals(expected, scoreOfString(input))
    }
}

fun scoreOfString(s: String): Int {
    return s.zipWithNext().sumOf {
        abs(it.first.code - it.second.code)
    }
}
