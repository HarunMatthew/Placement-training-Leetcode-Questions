class Solution {
    public boolean isPalindrome(int x) {
        /*int rev=0;
        int x1=x;
        while(x1>0){
            rev=rev*10+(x1%10);
            x1=x1/10;
        }
        if(x==rev){
            return true;
        }
        return false;*/
        if(x<0){
            return false;
        }
        String s=String.valueOf(x);
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.print(s.isPalindrome(x));
    }
    
}