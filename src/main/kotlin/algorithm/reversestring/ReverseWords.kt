package algorithm.reversestring

fun reverseWords(s: String): String {
    var start = 0
    var wordEnd = 0
    val sb = StringBuilder()
    while(wordEnd<s.length){
        if(s[wordEnd] == ' '){
            sb.append(s.substring(start, wordEnd).reversed()).append(' ')
            start=wordEnd+1
            wordEnd = start
        }
        wordEnd++
    }
    return sb.append(s.substring(start, wordEnd).reversed()).toString()
}