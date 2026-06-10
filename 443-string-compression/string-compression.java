class Solution {
    public int compress(char[] chars) {
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                count++;
            }
            else{
                sb.append(chars[i-1]);
                if(count>1){
                    sb.append(count);
                }
                count=1;
            }
        }
        sb.append(chars[chars.length-1]);
        if(count>1){
            sb.append(count);
        }
        String str=sb.toString();

        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        return str.length();
    }
}