class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum=0;
        int ssum=0;

        int temp=n;
        while(n!=0){
            int digit = n%10;
            dsum=dsum+digit;
            n=n/10;
        }
        while(temp!=0){
            int digit = temp%10;
            ssum=ssum+(int)(Math.pow(digit,2));
            temp=temp/10;
        }
        
        if((ssum-dsum)>=50){
            return true;
        }

        return false;
    }
}