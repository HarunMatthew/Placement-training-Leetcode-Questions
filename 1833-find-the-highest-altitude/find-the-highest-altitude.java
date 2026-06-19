class Solution {
    public int largestAltitude(int[] gain) {
        int sum=0;
        int max=0;
        for(int num:gain){
            sum=sum+num;
            max=sum>max?sum:max;
        }
        return max;
    }
}