class Solution {
   fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val min = lottos.intersect(win_nums.toList()).count()
        val max = min+(lottos.count { it == 0 })
       
        //println("min=$min, max=$max")
        
        return mutableListOf(getScore(max), getScore(min)).toIntArray()
    }
    
    fun getScore(number: Int): Int {
        return when(number) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }
}