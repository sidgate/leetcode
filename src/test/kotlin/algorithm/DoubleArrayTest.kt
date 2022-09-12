package algorithm

import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertContentEquals

class DoubleArrayTest {
    @Test
    fun emptyArray() {
        assertContentEquals(intArrayOf(), getConcatenation(intArrayOf()))
    }

    @Test
    fun singleElem() {
        assertContentEquals(intArrayOf(1,1), getConcatenation(intArrayOf(1)))
    }

    @Test
    fun givenInput() {
        assertContentEquals(intArrayOf(1,2,1,1,2,1), getConcatenation(intArrayOf(1,2,1)))
        assertContentEquals(intArrayOf(1,3,2,1,1,3,2,1), getConcatenation(intArrayOf(1,3,2,1)))
    }

}

fun getConcatenation(nums: IntArray): IntArray {
    val result = Arrays.copyOf(nums,nums.size + nums.size)
    System.arraycopy(nums, 0, result, nums.size, nums.size)
    return result
}
