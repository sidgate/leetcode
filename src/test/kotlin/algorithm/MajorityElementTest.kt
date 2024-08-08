package algorithm

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.of
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class MajorityElementTest {
    companion object {
        @JvmStatic
        fun data() = listOf(
            of(intArrayOf(1), 1),
            of(intArrayOf(3,2,3), 3),
            of(intArrayOf(2,2,1,1,1,2,2), 2)
        )
    }

    @ParameterizedTest
    @MethodSource("data")
    fun findMajorityElement(nums: IntArray, expected: Int){
        assertEquals(expected, majorityElement(nums))
    }
}

fun majorityElement(nums: IntArray): Int {
    return nums.groupBy { it }.entries.maxByOrNull { it.value.size }!!.key
}