class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0

        var firstCount = 0
        var firstLetter: Char? = null
        var lastCount = 0

        s.forEach {
            if (firstLetter == null) {
                firstLetter = it
                firstCount++
            } else {
                if (firstLetter == it) {
                    firstCount++
                } else {
                    lastCount++

                    if (firstCount == lastCount) {
                        answer++
                        firstLetter = null
                        firstCount = 0
                        lastCount = 0
                    }
                }
            }
        }

        if (firstCount > 0) {
            answer++
        }

        return answer
    }
}