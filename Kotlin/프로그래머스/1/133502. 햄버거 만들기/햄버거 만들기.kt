class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0

        val list = mutableListOf<Int>()

        for (item in ingredient) {
            list.add(item)

            // 마지막 4개의 재료가 1, 2, 3, 1인지 확인
            if (list.takeLast(4) == listOf(1,2,3,1)) {
                repeat(4) {
                    list.removeAt(list.lastIndex)
                }
                answer++
            }
        }

        return answer
    }
}