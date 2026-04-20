class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int sum1=0;
        for(int i=nums.length-1;i>=nums.length-k;i--){
            sum=sum+nums[i];
        }
        for(int i=0;i<k;i++){
            sum1=sum1+nums[i];
        }
        return Math.abs(sum-sum1);
    }
}