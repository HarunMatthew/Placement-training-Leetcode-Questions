class Solution {
    public boolean isBalanced(String nums) {
        int sumodd=0;
        int sumeven=0;
        for(int i=0;i<nums.length();i=i+2){
            sumodd=sumodd+(nums.charAt(i)-'0');
        }
        for(int i=1;i<nums.length();i=i+2){
            sumeven=sumeven+(nums.charAt(i)-'0');
        }
        if(sumodd==sumeven){
            return true;
        }
        return false;
    }
}