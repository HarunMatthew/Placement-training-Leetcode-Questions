class Solution {
    public String compressedString(String word) {
        int count=1;

        char ch[]=word.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]&&count<9)
            {
                count++;
            }

            
            else{
                sb.append(count);
                sb.append(ch[i]);
                count=1;
            }
        }
        sb.append(count);
        sb.append(ch[ch.length-1]);
       String s=sb.toString();

       return s;
    }
}