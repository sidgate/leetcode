package twoSum


fun twoSum(numbers: IntArray, target: Int): IntArray {
    var i = 0
    while(i<numbers.size) {
        val sec = target - numbers[i]

        var left = i + 1
        var right = numbers.size - 1
        var result = -1
        while (left <= right) {
            val mid = (left + right) / 2

            if (sec == numbers[mid]) {
                result = mid
                break
            } else if (sec < numbers[mid]) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        if (result > 0) return intArrayOf(i + 1, result + 1)
        i++
    }
    return intArrayOf()
}
