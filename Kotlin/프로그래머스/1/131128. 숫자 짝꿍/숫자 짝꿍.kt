import kotlin.math.min

class Solution {
      fun solution(X: String, Y: String): String {

        val xMap = mutableMapOf<Char, Int>()
        val yMap = mutableMapOf<Char, Int>()

        for (x in X.toCharArray()) {
            xMap[x] = ((xMap[x] ?: 0) + 1)
        }
        for (y in Y.toCharArray()) {
            yMap[y] = ((yMap[y] ?: 0) + 1)
        }

        val sb = StringBuilder()

        for (num in (9 downTo 0)) {
            val x = (xMap[num.digitToChar()] ?: 0)
            val y = (yMap[num.digitToChar()] ?: 0)

            if (x!=0 && y!=0) {
                val min = min(x,  y)
                for (i in (0 until min)) {
                    sb.append(num)
                }
            }
        }

        val answer = sb.toString()

        return if (answer.isEmpty()) {
            "-1"
        } else if (answer.startsWith("0")) {
            "0"
        } else {
            answer
        }
    }
}