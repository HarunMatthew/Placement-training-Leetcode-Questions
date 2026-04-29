class Solution {
    public boolean areOccurrencesEqual(String s) {
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        int n=0;
        for(int i:freq){
            if(i!=0){
                n=i;
                break;
            }
        }
        for(int i:freq){
            if(i!=n&&i!=0){
                return false;
            }
        }
        return true;
        
    }
}