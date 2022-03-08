package twoSum

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource

internal class SolutionTest{

    companion object {
        @JvmStatic
        fun data() = listOf(
            of(intArrayOf(1,2),3, intArrayOf(0,1)),
            of(intArrayOf(2,7,11,15), 9, intArrayOf(0,1)),
            of(intArrayOf(3,2,4), 6, intArrayOf(1,2)),
            of(intArrayOf(3,3), 6, intArrayOf(0,1))
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun `test two sum`(input: IntArray, target: Int, expected: IntArray){
        assertArrayEquals(expected, Solution().twoSum(input, target))
    }


}