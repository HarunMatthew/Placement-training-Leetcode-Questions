class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        int sum1=0;
        String str=String.valueOf(n);
        for(int i=0;i<str.length();i+=2){
            sum=sum+str.charAt(i)-'0';
        }
        for(int i=1;i<str.length();i+=2){
            sum1=sum1+str.charAt(i)-'0';
        }
        return sum-sum1;
    }
}