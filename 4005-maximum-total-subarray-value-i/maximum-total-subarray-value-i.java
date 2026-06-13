class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;

        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(num,max);
        }
        return (max-min)*k;
    }

}