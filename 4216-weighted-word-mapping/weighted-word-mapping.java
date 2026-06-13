class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb=new StringBuilder();

        for(String s:words){

            int sum=0;

            for(char ch:s.toCharArray()){
                sum=sum+weights[ch-'a'];
            }

            int mod=sum%26;

            sb.append((char)('z'-mod));
        }
        return sb.toString();
    }


}