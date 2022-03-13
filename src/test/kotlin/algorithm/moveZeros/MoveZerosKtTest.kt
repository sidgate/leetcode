package algorithm.moveZeros

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class MoveZerosKtTest {
    companion object {
        @JvmStatic
        fun data() = listOf(
            of(intArrayOf(1), intArrayOf(1)),
            of(intArrayOf(0), intArrayOf(0)),
            of(intArrayOf(0,0), intArrayOf(0,0)),
            of(intArrayOf(0,1), intArrayOf(1,0)),
            of(intArrayOf(1,0), intArrayOf(1,0)),
            of(intArrayOf(0,1,0,3,12), intArrayOf(1,3,12,0,0)),
            of(intArrayOf(1,0,3,0,4,6,0,12,0), intArrayOf(1,3,4,6,12,0,0,0,0)),
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `rotate array`(nums: IntArray, expected: IntArray) {
        moveZeroes(nums)
        assertArrayEquals(expected, nums)
    }
}