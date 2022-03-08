package mergeSortedArray

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class SolutionTest {
    companion object {
        @JvmStatic
        fun data() = listOf(
            of(intArrayOf(1), 1, intArrayOf(), 0, intArrayOf(1)),
            of(intArrayOf(0), 0, intArrayOf(1), 1, intArrayOf(1)),
            of(intArrayOf(1,2,3,0,0,0), 3, intArrayOf(2,5,6), 3, intArrayOf(1,2,2,3,5,6))
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `test two sum`(nums1: IntArray, m: Int, nums2: IntArray, n: Int, expected: IntArray){
        Solution().merge(nums1, m, nums2, n)
        assertArrayEquals(expected, nums1)
    }
}