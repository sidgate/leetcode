package algorithm.squares

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

internal class SquaresOfSortedArrayKtTest{
    companion object {
        @JvmStatic
        fun data() = listOf(
            Arguments.of(intArrayOf(1), intArrayOf(1)),
            Arguments.of(intArrayOf(-1,1), intArrayOf(1,1)),
            Arguments.of(intArrayOf(-2,-1), intArrayOf(1,4)),
            Arguments.of(intArrayOf(-1,2), intArrayOf(1,4)),
            Arguments.of(intArrayOf(1,2), intArrayOf(1,4)),
            Arguments.of(intArrayOf(1,2,3), intArrayOf(1,4,9)),
            Arguments.of(intArrayOf(-1,2,3), intArrayOf(1,4,9)),
            Arguments.of(intArrayOf(-2,-1,3), intArrayOf(1,4,9)),
            Arguments.of(intArrayOf(-3,-2,1), intArrayOf(1,4,9)),
            Arguments.of(intArrayOf(-3,-2,-1), intArrayOf(1,4,9)),
            Arguments.of(intArrayOf(-4,-1,0,3,10), intArrayOf(0,1,9,16,100)),
            Arguments.of(intArrayOf(-7,-3,2,3,11), intArrayOf(4,9,9,49,121)),

        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `test sorted squares`(nums: IntArray, expected: IntArray) {
        assertArrayEquals(expected, sortedSquares(nums))
    }
}