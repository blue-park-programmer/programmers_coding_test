class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0

       val reservePeople = reserve.toMutableSet()
        val lostPeople = lost.toMutableSet().subtract(reserve.toSet()).sorted()
        reservePeople.removeAll(lost.toSet())
        reservePeople.sorted()

        if (!reservePeople.isEmpty()) {
            for (lostPerson in lostPeople) {

                if (reservePeople.contains(lostPerson-1)) {
                    reservePeople.remove(lostPerson-1)
                    answer++
                    continue
                } else if (reservePeople.contains(lostPerson+1)) {
                    reservePeople.remove(lostPerson+1)
                    answer++
                    continue
                }
            }
        }

        return n - (lostPeople.size - answer)
    }
}