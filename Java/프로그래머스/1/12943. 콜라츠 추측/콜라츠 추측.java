class Solution {
    public int solution(int num) {
        int answer = 0;
        long collatz = num;
        
        if (num == 1) {
            return 0;
        }

        for (int i=0; i<500; i++) {
            if (collatz%2 == 0) {
                collatz = collatz/2;
            } else {
                collatz = collatz*3 + 1;
            }

            answer++;
            
            if (collatz == 1) {
                return answer;
            }
        }
        
        return -1;
    }
}