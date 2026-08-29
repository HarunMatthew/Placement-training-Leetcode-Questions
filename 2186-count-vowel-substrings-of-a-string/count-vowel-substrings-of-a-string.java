class Solution {
    int count = 0;
    public int countVowelSubstrings(String word) {
        for(int i=0;i<word.length();i++){
            
            for(int j=i+1;j<=word.length();j++){
            
                check(word.substring(i, j));
            }
            
        }
        return count;
    }

    public void check(String s){
        
        
        LinkedHashSet<Character> set = new LinkedHashSet<>();


        for(char ch:s.toCharArray()){
            if ("aeiou".indexOf(ch) == -1) {
                return;
            }
            set.add(ch);
            
        }

        if(set.size()==5){
            count++;
        }
    }
}