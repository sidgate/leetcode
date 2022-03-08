package maxsubarray

class Solution {
    fun maxSubArray(nums: IntArray): Int {

        var maxSum = nums[0]
        var currentSum = nums[0]

        for(i in 1 until nums.size){
            val n = nums[i]
            val sum = currentSum + n
            maxSum = maxOf(n, sum, maxSum)
            currentSum = if(sum <n) n else sum
        }
        return maxSum
    }
}