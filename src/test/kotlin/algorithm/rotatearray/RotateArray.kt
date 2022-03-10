package algorithm.rotatearray

import java.util.BitSet

fun rotate(nums: IntArray, k: Int) {
    val newK = k%nums.size
    if(nums.size <=1 || newK == 0) return
    var indexBeingReplaced = newK
    var numberBeingReplaced = nums[0]
    val moved = BitSet()
    repeat(nums.size) {
        val temp = nums[indexBeingReplaced]
        nums[indexBeingReplaced] = numberBeingReplaced
        numberBeingReplaced = temp
        val tmp = if (indexBeingReplaced + newK >= nums.size) indexBeingReplaced + newK - nums.size else indexBeingReplaced + newK

        moved.set(indexBeingReplaced)
        if(moved.get(tmp)){
            indexBeingReplaced++
            numberBeingReplaced = nums[indexBeingReplaced]
        }
        indexBeingReplaced = if (indexBeingReplaced + newK >= nums.size) indexBeingReplaced + newK - nums.size else indexBeingReplaced + newK

    }
}