class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
    var answer: Int = 0

    val tangerineMap = hashMapOf<Int, Int>()
    tangerine.map {
        tangerineMap[it] = tangerineMap.getOrDefault(it, 0) + 1
    }
    
    var count = 0
    val sortedMap = tangerineMap.toList().sortedByDescending { it.second }.toMap()
     sortedMap.forEach { s, c ->
        //println("1 = $s, $c")
        if (count < k) {
            count += c
            answer++
        }
        //println("2 = $count, $answer")
    }

    return answer
}
}