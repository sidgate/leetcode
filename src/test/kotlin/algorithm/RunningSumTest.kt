package algorithm

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class RunningSumTest {
    @Test
    fun emptyArr(){
        assertContentEquals(intArrayOf(), runningSum(intArrayOf()))
    }
    @Test
    fun singleNum(){
        assertContentEquals(intArrayOf(1), runningSum(intArrayOf(1)))
    }
    @Test
    fun twoNums(){
        assertContentEquals(intArrayOf(1,2), runningSum(intArrayOf(1,1)))
        assertContentEquals(intArrayOf(1,3), runningSum(intArrayOf(1,2)))
    }

    @Test
    fun givenInput(){
        assertContentEquals(intArrayOf(1,3,6,10), runningSum(intArrayOf(1,2,3,4)))
        assertContentEquals(intArrayOf(1,2,3,4,5), runningSum(intArrayOf(1,1,1,1,1)))
        assertContentEquals(intArrayOf(3,4,6,16,17), runningSum(intArrayOf(3,1,2,10,1)))
    }
}

fun runningSum(nums: IntArray): IntArray {
    return nums.foldIndexed(nums){ index, acc, i ->
        acc[index] = if (index > 0) acc[index-1]+i else i
        acc
    }
}