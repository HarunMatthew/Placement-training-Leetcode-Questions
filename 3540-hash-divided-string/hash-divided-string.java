class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i=i+k){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum=sum+s.charAt(j)-'a';
            }
            char ch=(char)('a'+(sum%26));
            sb.append(ch);
        }
        return sb.toString();
    }
}