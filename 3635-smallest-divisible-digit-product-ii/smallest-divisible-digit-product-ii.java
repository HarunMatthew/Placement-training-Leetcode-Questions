import java.util.Arrays;

public class Solution {
    public String smallestNumber(String num, long t) {
        int[] required = new int[10];
        long tempT = t;
        int[] primes = {2, 3, 5, 7};
        for (int p : primes) {
            while (tempT % p == 0) {
                required[p]++;
                tempT /= p;
            }
        }
        if (tempT > 1) {
            return "-1";
        }

        int n = num.length();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = num.charAt(i) - '0';
        }
        int firstZero = -1;
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) {
                firstZero = i;
                break;
            }
        }
        int limit = (firstZero == -1) ? n : firstZero;
        int[][] prefixFactors = new int[n + 1][10];
        
        for (int i = 0; i < limit; i++) {
            System.arraycopy(prefixFactors[i], 0, prefixFactors[i + 1], 0, 10);
            addFactors(prefixFactors[i + 1], digits[i]);
        }
        if (firstZero == -1 && isCovered(prefixFactors[n], required)) {
            return num;
        }
        int startPos = (firstZero == -1) ? n - 1 : firstZero;
        for (int i = startPos; i >= 0; i--) {
            int currentDigit = digits[i];
            for (int d = currentDigit + 1; d <= 9; d++) {
                int[] currentFactors = Arrays.copyOf(prefixFactors[i], 10);
                addFactors(currentFactors, d);
                int remainingLen = n - 1 - i;
                if (canSatisfy(currentFactors, required, remainingLen)) {
                    StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < i; j++) {
                        sb.append(digits[j]);
                    }
                    sb.append(d);
                    appendSmallestSuffix(currentFactors, required, remainingLen, sb);
                    return sb.toString();
                }
            }
        }
        int extraLen = n + 1;
        while (true) {
            int[] currentFactors = new int[10];
            if (canSatisfy(currentFactors, required, extraLen)) {
                StringBuilder sb = new StringBuilder();
                appendSmallestSuffix(currentFactors, required, extraLen, sb);
                return sb.toString();
            }
            extraLen++;
        }
    }
    private void addFactors(int[] factors, int d) {
        if (d == 2 || d == 4 || d == 6 || d == 8) {
            if (d == 2) factors[2] += 1;
            if (d == 4) factors[2] += 2;
            if (d == 6) { factors[2] += 1; factors[3] += 1; }
            if (d == 8) factors[2] += 3;
        }
        if (d == 3 || d == 9) {
            if (d == 3) factors[3] += 1;
            if (d == 9) factors[3] += 2;
        }
        if (d == 5) factors[5] += 1;
        if (d == 7) factors[7] += 1;
    }
    private boolean isCovered(int[] current, int[] target) {
        return current[2] >= target[2] && current[3] >= target[3] && 
               current[5] >= target[5] && current[7] >= target[7];
    }
    private boolean canSatisfy(int[] current, int[] target, int remLen) {
        int req2 = Math.max(0, target[2] - current[2]);
        int req3 = Math.max(0, target[3] - current[3]);
        int req5 = Math.max(0, target[5] - current[5]);
        int req7 = Math.max(0, target[7] - current[7]);
        int digitsNeeded = req7 + req5; 
        
        // Bundle 3s into 9s
        digitsNeeded += req3 / 2;
        req3 %= 2;
        digitsNeeded += req2 / 3;
        req2 %= 3;
        if (req2 > 0 && req3 > 0) {
            digitsNeeded += 1;
            req2--;
            req3--;
        }
        digitsNeeded += req3; 
        digitsNeeded += (req2 + 1) / 2; 

        return digitsNeeded <= remLen;
    }
    private void appendSmallestSuffix(int[] current, int[] target, int remLen, StringBuilder sb) {
        for (int i = 0; i < remLen; i++) {
            for (int d = 1; d <= 9; d++) {
                int[] nextFactors = Arrays.copyOf(current, 10);
                addFactors(nextFactors, d);
                if (canSatisfy(nextFactors, target, remLen - 1 - i)) {
                    sb.append(d);
                    current = nextFactors;
                    break;
                }
            }
        }
    }
}
