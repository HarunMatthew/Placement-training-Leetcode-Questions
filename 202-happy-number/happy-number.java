class Solution {
    public boolean isHappy(int n) {
           HashSet<Integer> set=new HashSet<>();
       while(n!=1 && !set.contains(n)){

            set.add(n);
            int rev=0;
        
            while(n>0){
                int digit=n%10;
                rev=rev+(digit*digit);
                n=n/10;
            }
            n=rev;
       }

        if(n==1){
            return true;
        }
        else{
            return false;
        }
        
    }
}