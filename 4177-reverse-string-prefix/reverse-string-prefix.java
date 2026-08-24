class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i==k){
                break;
            }
            sb.append(s.charAt(i));
        }
        sb.reverse();
        String temp = sb.toString();
        for(int i=k;i<s.length();i++){
            temp = temp + s.charAt(i);
        }
        
        return temp;
    }
}