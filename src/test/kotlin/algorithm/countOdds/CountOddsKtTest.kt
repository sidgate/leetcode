package algorithm.countOdds

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class CountOddsKtTest{
    companion object {
        @JvmStatic
        fun data() = listOf(
            of(1, 1, 1),
            of(2, 2, 0),
            of(2, 3, 1),
            of(2, 4, 1),
            of(1, 3, 2),
            of(1, 2, 1),
            of(3, 7, 3),
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `test binary search`(low: Int, high: Int, expected: Int){
        assertEquals(expected, countOdds(low, high))
    }
}