class Solution {
    public int reverse(int x) {
        
        long s1=0;
        while(x!=0){
            int digit=x%10;
            s1=s1*10+(digit);
            x=x/10;
        }

        if(s1<Integer.MIN_VALUE || s1>Integer.MAX_VALUE){
            return 0;
        }

        return (int)s1;
    }
}