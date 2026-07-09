class Solution {
    public long sumAndMultiply(int n) {

        if(n==0){
            return 0;
        }
        String str=String.valueOf(n);
        str=str.replaceAll("0","");
        long num=Long.parseLong(str);
        long ans=1;
        long sum=0;
        for(char ch:str.toCharArray()){
            sum=sum+(ch-'0');
        }
        ans=num*sum;
        return ans;
    }
}