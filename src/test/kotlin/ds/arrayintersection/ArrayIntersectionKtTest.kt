package ds.arrayintersection

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class ArrayIntersectionKtTest {
    companion object {
        @JvmStatic
        fun data() = listOf(
            of(intArrayOf(1), intArrayOf(1), intArrayOf(1)),
            of(intArrayOf(), intArrayOf(1), intArrayOf()),
            of(intArrayOf(1,2,2,1), intArrayOf(1,2), intArrayOf(1,2)),
            of(intArrayOf(4,9,5), intArrayOf(9,4,9,8,4), intArrayOf(9,4)),
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `test intersections`(nums1: IntArray, nums2: IntArray, expected: IntArray) {
        assertArrayEquals(expected, intersect(nums1, nums2))
    }
}