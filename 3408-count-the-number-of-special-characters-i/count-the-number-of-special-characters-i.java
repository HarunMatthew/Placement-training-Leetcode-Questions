class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
        String s = "";
        for(char c:word.toCharArray()){
            set.add(c);
        }
        for(char ch:set){
            s=s+ch;
        }
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                String temp = String.valueOf(s.charAt(i));
                temp = temp.toUpperCase();
                if(s.contains(temp)){
                    count++;
                }
            }
        }
        return count;
    }
}