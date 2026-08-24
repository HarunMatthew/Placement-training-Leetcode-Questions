class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        int limit = 1 << n; 
        for (int i = 0; i < limit; i++) {
            String s = Integer.toBinaryString(i);
            

            while (s.length() < n) {
                s = "0" + s;
            }
            
         
            if (!s.contains("00")) {
                list.add(s);
            }
        }
        
        return list;
    }
}
