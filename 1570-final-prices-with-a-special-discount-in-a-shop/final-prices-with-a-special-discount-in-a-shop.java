class Solution {
    public int[] finalPrices(int[] prices) {
        int nums[]=new int[prices.length];
        for(int i=0;i<prices.length-1;i++){
            int a=prices[i];
            nums[i]=a;
            for(int j=i+1;j<nums.length;j++){
                int b=prices[j];
                if(a>=b){
                    nums[i]=a-b;
                    break;
                }                
            }


            
        }
        nums[nums.length-1]=prices[prices.length-1];
        return nums;
    }
    
}