class Solution {
    public void moveZeroes(int[] nums) {
        int ind=0;
        for(int i:nums){
            if(i!=0){
                nums[ind++]=i;
            }
        }
        while(ind<nums.length){
            nums[ind++]=0;
        }
        System.out.println(Arrays.toString(nums));

    }
}