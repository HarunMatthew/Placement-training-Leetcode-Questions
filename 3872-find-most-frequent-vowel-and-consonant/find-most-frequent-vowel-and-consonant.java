class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int max=0;
        int max1=0;
        for(char c:map.keySet()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                max=Math.max(max,map.get(c));
            }
            else{
                max1=Math.max(max1,map.get(c));
            }
        }
        return max+max1;
    }
}