class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count =0;
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder(words[i]);
            sb.reverse();
            String st=sb.toString();
            for(int j=i+1;j<words.length;j++){
                if(st.equals(words[j])){
                    count++;
                }
            }
        }
        return count;
    }
}