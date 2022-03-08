package algorithm.binarysearch

fun search(nums: IntArray, target: Int): Int {
    var start = 0
    var end = nums.size-1
    while (true){
        if(target>nums[end] || target<nums[start] )  break
        if(end -start <= 1) {
            return if(nums[start] == target) start else if (nums[end] == target) end else -1
        }
        else{
            val mid = (end-start)/2 + start
            if(nums[mid] <target) start = mid
            else end = mid
        }
    }
    return -1
}
