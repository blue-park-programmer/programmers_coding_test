class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val answer = mutableListOf<Int>()

        val minPressMap = mutableMapOf<Char, Int>()

        for (key in keymap) {
            for ((index, char) in key.withIndex()) {
                // char의 최소 입력 횟수를 Map에 저장
                minPressMap[char] = minOf(
                    minPressMap[char] ?: Int.MAX_VALUE,
                    index + 1
                )
            }
        }

        for (target in targets) {
            var count = 0
            for (t in target) {
                val press = minPressMap[t] ?: -1

                if (press == -1) {
                    count = -1
                    break
                }

                count += press
            }

            answer.add(count)
        }

        return answer.toIntArray()
    }
}