class Solution {
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;

        // Step 1: Find the length of the number that contains the nth digit
        while (n > len * count) {
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }

        // Step 2: Find the actual number
        // n - 1 handles 0-based indexing for the exact digit offset
        start += (n - 1) / len;

        // Step 3: Find the specific digit within that number
        String s = Integer.toString(start);
        return s.charAt((n - 1) % len) - '0';
    }
}
