package algorithm.badVersion

class Solution(versionControl: VersionControl): VersionControl by versionControl {
    fun firstBadVersion(n: Int) : Int {
        var start = 1
        var end = n
        while (start < end){
            val mid = start + (end-start)/2
            val isBad = isBadVersion(mid)
            if (isBad) end = mid else start = mid +1
        }
        return start
    }
}


interface VersionControl {
    fun isBadVersion(version: Int): Boolean
}

