class Solution {
    public int hammingWeight(int n) {
        String bin=Integer.toBinaryString(n);
        bin=bin.replaceAll("[0]","");
        return bin.length();
    }
}