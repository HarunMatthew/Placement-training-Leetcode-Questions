class Solution {
    public boolean halvesAreAlike(String s) {
        String a="";
        String b="";
        int len=s.length()/2;
        for(int i=0;i<len;i++){
            a=a+s.charAt(i);
        }
        for(int i=len;i<s.length();i++){
            b=b+s.charAt(i);
        }
        a=a.replaceAll("[^aeiouAEIOU]","");
        b=b.replaceAll("[^aeiouAEIOU]","");
        if(a.length()==b.length()){
            return true;
        
        }
        return false;
    }
}