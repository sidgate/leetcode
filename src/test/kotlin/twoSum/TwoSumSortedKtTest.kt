package twoSum

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class TwoSumSortedKtTest{
    companion object {
        @JvmStatic
        fun data() = listOf(
            of(intArrayOf(1, 2), 3, intArrayOf(1, 2)),
            of(intArrayOf(2, 7, 11, 15), 9, intArrayOf(1, 2)),
            of(intArrayOf( 2, 3, 4), 6, intArrayOf(1, 3)),
            of(intArrayOf(3, 3), 6, intArrayOf(1, 2)),
            of(intArrayOf(-3, 3), 0, intArrayOf(1, 2)),
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `test two sum`(input: IntArray, target: Int, expected: IntArray){
        assertArrayEquals(expected, twoSum(input, target))
    }
}