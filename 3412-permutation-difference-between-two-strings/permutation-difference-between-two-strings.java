class Solution {
    public int findPermutationDifference(String s, String t) {
        char ch[]=s.toCharArray();
        char ch1[]=t.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length-1;i++){
            for(int j=i+1;j<ch1.length;j++){
                if(ch[i]==ch1[j]){
                    sum=sum+Math.abs(i-j);
                }
            }
        }
        return sum*2;
    }
}