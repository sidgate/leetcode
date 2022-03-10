package algorithm.rotatearray

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class RotateArrayKtTest {
    companion object {
        @JvmStatic
        fun data() = listOf(
            of(intArrayOf(1), 0, intArrayOf(1)),
            of(intArrayOf(1,2), 1, intArrayOf(2,1)),
            of(intArrayOf(1,2), 2, intArrayOf(1,2)),
            of(intArrayOf(1,2,3,4,5,6), 3, intArrayOf(4,5,6,1,2,3)),
            of(intArrayOf(1,2,3,4,5,6,7), 3, intArrayOf(5,6,7,1,2,3,4)),
            of(intArrayOf(1,2,3,4,5,6,7), 7, intArrayOf(1,2,3,4,5,6,7)),
            of(intArrayOf(1,2,3,4,5,6,7), 6, intArrayOf(2,3,4,5,6,7,1)),
            of(intArrayOf(1,2,3,4), 2, intArrayOf(3,4,1,2)),
            of(intArrayOf(-1,-100,3,99), 2, intArrayOf(3,99,-1,-100))
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `rotate array`(nums: IntArray, k: Int, expected: IntArray) {
        rotate(nums,k)
        println(nums.toList())
        assertArrayEquals(expected, nums)
    }
}