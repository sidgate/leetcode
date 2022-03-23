package algorithm.reversestring

fun reverseString(s: CharArray) {
    var start = 0
    var end = s.size-1
    var t: Char
    while(start<=end) {
        t = s[start]
        s[start++] = s[end]
        s[end--] = t
    }
}