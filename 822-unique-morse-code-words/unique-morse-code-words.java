class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String mor[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashMap<Character,String> map=new HashMap<>();
        char ch='a';
        for(int i=0;i<26;i++){
            map.put(ch++,mor[i]);
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<temp.length();j++){
                char c=temp.charAt(j);
                String s=map.getOrDefault(c,"");
                sb.append(s);
            }
            list.add(sb.toString());
        }
        HashSet<String> set=new HashSet<>();
        for(String i:list){
            set.add(i);
        }
        return set.size();
    }
}