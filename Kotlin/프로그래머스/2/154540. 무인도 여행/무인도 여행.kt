class Solution {
fun solution(maps: Array<String>): IntArray {
    var answer = mutableListOf<Int>()

    val visited = Array(maps.size) {
        BooleanArray(maps[0].length)
    }

    for (x in maps.indices) {
        for (y in maps[0].indices) {
            if (
                !visited[x][y] &&
                maps[x][y] != 'X'
            ) {
                answer.add(dfs(maps, visited, x, y))
            }
        }
    }

    return if (answer.isEmpty()) intArrayOf(-1) else answer.sorted().toIntArray()
}

fun dfs(
    maps: Array<String>,
    visited: Array<BooleanArray>,
    x: Int,
    y: Int,
): Int {
    if (
        x < 0 ||
        y < 0 ||
        x >= maps.size ||
        y >= maps[0].length ||
        maps[x][y] == 'X' ||
        visited[x][y]
    ) {
        return 0
    }

    var sum = maps[x][y].digitToInt()

    visited[x][y] = true

    sum += dfs(maps, visited, x-1, y)
    sum += dfs(maps, visited, x, y-1)
    sum += dfs(maps, visited, x+1, y)
    sum += dfs(maps, visited, x, y+1)

    return sum
}
}