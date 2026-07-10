class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long start = 0;
        long end = 0;
        if (a==b) {
            return a;
        } else if(a < b) {
            start = a;
            end = b;
        } else {
            start = b;
            end = a;
        }
        for (long i=start; i<=end; i++) {
            answer += i;
        }
        return answer;
    }
}