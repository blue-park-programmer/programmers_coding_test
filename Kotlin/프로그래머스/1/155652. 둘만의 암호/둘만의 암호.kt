class Solution {
    fun solution(s: String, skip: String, index: Int): String {

        val list = ('a'..'z').toMutableList()
        list.removeAll(skip.toCharArray().toList())

        val sb = StringBuilder()

        s.forEach {
            var i = list.indexOf(it) + index

            while (i >= list.size) {
                i -= list.size
            }

            sb.append(list[i])
        }

        return sb.toString()
    }
}