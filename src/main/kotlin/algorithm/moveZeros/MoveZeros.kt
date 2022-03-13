package algorithm.moveZeros

fun moveZeroes(nums: IntArray) {

    var i = 0
    var j = 0

    while(i<nums.size){
        if(nums[i] != 0){
            nums[j++] = nums[i]
        }
        i++
    }
    while (j<nums.size) nums[j++] = 0
}