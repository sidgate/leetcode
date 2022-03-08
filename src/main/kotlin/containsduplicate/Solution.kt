package containsduplicate

import java.util.BitSet

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        if(nums.size <2) return false
        val positive = BitSet()
        val negative = BitSet()
        nums.forEach {
            if (it<0) {
                if (!negative.get(-it)) negative.set(-it)
                else return true
            }
            else if(!positive.get(it)) positive.set(it)
            else return true
        }
        return false
    }
}