class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int num = nums[nums.length-1];
        int count = 0;
        while(count!=k){
            sum = sum + num;
            num++;
            count++;
        }
        return sum;
    }
}