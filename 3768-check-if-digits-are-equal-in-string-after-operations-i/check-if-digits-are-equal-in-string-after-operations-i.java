class Solution {
    public boolean hasSameDigits(String s) {
        
        
            while(s.length()>2){
                String str="";
                for(int i=0;i<s.length()-1;i++){
                    int num=s.charAt(i)-'0'+s.charAt(i+1)-'0';
                    str=str+num%10;
                }
                s=str;
            }
        if(s.charAt(0)==(s.charAt(1))){
            return true;
        }
        return false;
    }
}