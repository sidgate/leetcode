package algorithm.badVersion

fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size-1
    while (left < right){
        val pivot = left + (right-left)/2
        if(nums[pivot] < target) left = pivot+1
        else right = pivot
    }
    return if (nums[left]<target) left+1  else left
}