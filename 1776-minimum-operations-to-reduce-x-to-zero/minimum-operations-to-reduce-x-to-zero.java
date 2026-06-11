class Solution {
    public int minOperations(int[] nums, int x) {
        int tot=0;

        for(int i:nums){
            tot=tot+i;
        }

        int k=tot-x;

        if(k<0){
            return -1;
        }

        int max=-1;
        int left =0;
        int sum=0;

        for(int right=0;right<nums.length;right++){

            sum=sum+nums[right];

            while(sum>k){
                sum=sum-nums[left];
                left++;
            }
                if(sum==k){
                    max=Math.max(max,right-left+1);
                }
        }
                
                
            
        
        if(max==-1){
            return -1;
        }
        return nums.length-max;
    }
}