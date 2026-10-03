class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        babbling.forEach {
            var currentIndex = 0
            var before = ""
            var currentStr = it
            while (it.length > currentIndex) {

                var pointWord = ""

                if (currentStr.startsWith("aya", currentIndex)) {
                    pointWord = "aya"
                }
                if (currentStr.startsWith("ye", currentIndex)) {
                    pointWord = "ye"
                }
                if (currentStr.startsWith("woo", currentIndex)) {
                    pointWord = "woo"
                }
                if (currentStr.startsWith("ma", currentIndex)) {
                    pointWord = "ma"
                }

                if (pointWord != "" && before != pointWord) {
                    before = pointWord
                    currentIndex += before.length
                } else {
                    break
                }
            }
            if (currentIndex == it.length) {
                answer++
            }
        }

        return answer
    }
}