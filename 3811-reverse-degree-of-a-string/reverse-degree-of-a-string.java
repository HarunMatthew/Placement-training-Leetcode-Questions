class Solution {
    public int reverseDegree(String str) {
        int sum = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            int value = 'z'-str.charAt(i)  + 1;
            sum = sum + value * (i+1);
        }

        return sum;
    }
}