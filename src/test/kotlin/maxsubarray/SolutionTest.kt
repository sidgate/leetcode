package maxsubarray

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class SolutionTest{

    companion object {
        @JvmStatic
        fun data() = listOf(
            of(intArrayOf(1), 1),
            of(intArrayOf(1,2), 3),
            of(intArrayOf(-1, 3), 3),
            of(intArrayOf(3,-1), 3),
            of(intArrayOf(-1,-2), -1),
            of(intArrayOf(-2,-1), -1),
            of(intArrayOf(-2,-3,-1), -1),
            of(intArrayOf(-2, 3,-1), 3),
            of(intArrayOf(-2, 3,-1,4), 6),
            of(intArrayOf(-2,1,-3,4,-1,2,1,-5,4), 6),
            of(intArrayOf(5,4,-1,7,8), 23)
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `test max subarray`(input: IntArray, expected: Int){
        assertEquals(expected, Solution().maxSubArray(input))
    }


}