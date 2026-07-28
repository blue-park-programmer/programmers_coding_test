class Solution {
    public int solution(int[] numbers) {
        int total = 0;
        for (int i=0; i<10; i++) {
            total += i;
        }

        int sum = 0;
        for (int i=0; i<numbers.length; i++) {
            sum += numbers[i];
        }

        return total-sum;
    }
}