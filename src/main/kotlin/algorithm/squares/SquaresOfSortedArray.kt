package algorithm.squares

import kotlin.math.abs

fun sortedSquares(nums: IntArray): IntArray {
    val squares = IntArray(nums.size)
    var left = 0
    var right = nums.size-1
    var i = right
    while (left<=right){
        squares[i--] = if(abs(nums[left]) > abs(nums[right])) nums[left]*nums[left++] else nums[right]*nums[right--]
    }
    return squares
}