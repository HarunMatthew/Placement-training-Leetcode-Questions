class Solution {
    public int maxDigitRange(int[] nums) {
        int sum =0;
        int max = 0;
        for(int i :nums){
            int n = i;
            int tempmax = Integer.MIN_VALUE;
            int tempmin = Integer.MAX_VALUE;
            if(n==0){
                tempmax = 0;
                tempmin = 0;
            }
            while(n!=0){
                int digit = n%10;
                if(digit > tempmax){
                    tempmax = digit;
                }

                if(digit < tempmin){
                    tempmin = digit;
                }
                
                n=n/10;

            }
            int diff = tempmax - tempmin;
            max = Math.max(max,diff);
        }
        for(int i:nums){
            int n = i;
            int tempmax = 0;
            int tempmin = 9;
            while(n!=0){
                int digit = n%10;
                if(digit > tempmax){
                    tempmax = digit;
                }

                if(digit < tempmin){
                    tempmin = digit;
                }

                n = n/10;
            }
            
            int diff  = tempmax - tempmin;

            if(diff == max){
                sum = sum+ i;
            }
        }
        return sum;
    }
}