import java.util.*;
class Solution {
     public int solution(int[][] maps) {

    Queue<int[]> queue = new LinkedList<>();

    boolean[][] visited = new boolean[maps.length][maps[0].length];

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    queue.offer(new int[]{0, 0, 1});
    visited[0][0] = true;

    while (!queue.isEmpty()) {

        int[] cur = queue.poll();

        int x = cur[0];
        int y = cur[1];
        int distance = cur[2];

        if (x == maps.length - 1 && y == maps[0].length - 1) {
            return distance;
        }

        for (int i = 0; i < 4; i++) {

            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 &&
                ny >= 0 &&
                nx < maps.length &&
                ny < maps[0].length &&
                maps[nx][ny] == 1 &&
                !visited[nx][ny]) {

                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny, distance + 1});
            }
        }
    }

    return -1;
}
}