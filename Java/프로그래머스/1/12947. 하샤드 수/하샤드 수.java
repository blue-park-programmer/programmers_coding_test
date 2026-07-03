class Solution {
    public boolean solution(int x) {
        int sum = 0;

        String[] arr = String.valueOf(x).split("");

        for (String s : arr) {
            sum += Integer.parseInt(s);
        }

        return (x%sum == 0);
    }
}