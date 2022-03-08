package algorithm.binarysearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class BinarySearchKtTest{
    companion object {
        @JvmStatic
        fun data() = listOf(
            of(intArrayOf(1, 2), 3, -1),
            of(intArrayOf(-1,0,3,5,9,12), 9, 4),
            of(intArrayOf(-1,0,3,5,9,12),2, -1)
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `test binary search`(nums: IntArray, target: Int, expected: Int){
        assertEquals(expected, search(nums, target))
    }
}