package ds.maxprofit

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class MaximumProfitKtTest {
    companion object {
        @JvmStatic
        fun data() = listOf(
            of(intArrayOf(1),0),
            of(intArrayOf(2,1),0),
            of(intArrayOf(1,1,1,1,1),0),
            of(intArrayOf(7,6,4,3,1),0),
            of(intArrayOf(7,1,5,3,6,4),5)
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `test max profit`(nums1: IntArray, expected: Int) {
        assertEquals(expected, maxProfit(nums1))
    }
}