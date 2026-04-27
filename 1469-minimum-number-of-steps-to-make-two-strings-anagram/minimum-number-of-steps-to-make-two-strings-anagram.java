class Solution {
    public int minSteps(String s, String t) {
        int freq[]=new int[26];
        int count=0;
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            freq[ch-'a']--;
        }
        for(int i:freq){
            if(i>0){
                count=count+i;
            }
        }
        return count;
    }
}