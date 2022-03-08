package twoSum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed{idx, it->
            val f = map[it]
            if(f!=null)  return intArrayOf(f, idx)
            map[target-it] = idx
        }
        return intArrayOf()
    }
}