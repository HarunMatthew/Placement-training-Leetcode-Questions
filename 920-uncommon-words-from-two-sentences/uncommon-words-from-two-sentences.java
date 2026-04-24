class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        String s[]=s1.split("\\s+");
        String t[]=s2.split("\\s+");
        for(String str:s){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String str:t){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(String str:map.keySet()){
            if(map.get(str)==1){
                list.add(str);
            }
        }
        String str1[]=new String[list.size()];
       int ind=0;
       for(String m:list){
            str1[ind++]=m;
       }
       return str1;
        
    }
}