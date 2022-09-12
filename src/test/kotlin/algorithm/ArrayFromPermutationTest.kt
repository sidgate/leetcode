package algorithm

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class ArrayFromPermutationTest {
    @Test
    fun emptyArray(){
        assertContentEquals(intArrayOf(), buildArray(intArrayOf()))
    }

    @Test
    fun singleElem(){
        assertContentEquals(intArrayOf(0), buildArray(intArrayOf(0)))
    }

    @Test
    fun twoElem(){
        assertContentEquals(intArrayOf(0,1), buildArray(intArrayOf(0,1)))
        assertContentEquals(intArrayOf(0,1), buildArray(intArrayOf(1,0)))
    }

    @Test
    fun givenInput(){
        assertContentEquals(intArrayOf(0,1,2,4,5,3), buildArray(intArrayOf(0,2,1,5,3,4)))
        assertContentEquals(intArrayOf(4,5,0,1,2,3), buildArray(intArrayOf(5,0,1,2,3,4)))
    }
}

fun buildArray(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    nums.forEachIndexed { index, i ->
        result[index] = nums[i]
    }
    return result
}