package ds.arrayintersection

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val (smaller,larger) = if(nums1.size > nums2.size) nums2 to nums1 else nums1 to nums2
    val numCounts = smaller.toList().groupingBy { it }.eachCount().toMutableMap()
    return larger.filter {
        if((numCounts[it]?:0) >0) {
            numCounts[it] = numCounts[it]?.minus(1) ?: 0
            true
        }else false
    }.toIntArray()
}