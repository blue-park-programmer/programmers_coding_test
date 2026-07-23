class Solution {
    fun solution(maps: Array<String>): IntArray {
        var result = mutableListOf<Int>()

        val visited = Array(maps.size) {
            BooleanArray(maps[0].length)
        }

        for (x in maps.indices) {
            for (y in maps[x].indices) {
                if (
                    maps[x][y] != 'X' &&
                    !visited[x][y]
                ) {
                    result.add(
                        dfs(maps, visited, x, y)
                    )
                }
            }
        }


       return if (result.isEmpty()) intArrayOf(-1) else result.sorted().toIntArray()
    }

    fun dfs(
        maps: Array<String>,
        visited: Array<BooleanArray>,
        x: Int,
        y: Int
    ): Int {
        if (
            x < 0 ||
            x >= maps.size ||
            y < 0 ||
            y >= maps[0].length ||
            visited[x][y] ||
            maps[x][y] == 'X'
        ) {
            return 0
        }

        visited[x][y] = true

        var sum = maps[x][y].digitToInt()

        sum += dfs(maps, visited, x-1, y)
        sum += dfs(maps, visited, x, y-1)
        sum += dfs(maps, visited, x+1, y)
        sum += dfs(maps, visited, x, y+1)

        return sum
    }
}