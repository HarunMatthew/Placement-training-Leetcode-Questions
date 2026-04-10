class Solution {
    public int getLeastFrequentDigit(int n) {
        String str=String.valueOf(n);
        int minFreq=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int result=-1;
        for(char key:map.keySet()){
            int freq = map.get(key);
            if (freq < minFreq) {
                minFreq = freq;
                result = key-'0';
            }
        }
        return result;
    }
}