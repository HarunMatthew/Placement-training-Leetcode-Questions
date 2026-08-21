class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len = s.length();

        s=s.replaceAll("0","");
        int count = s.length();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<count-1;i++){
            sb.append(1);
        }

        for(int i=0;i<len-count;i++){
            sb.append(0);
        }
        sb.append(1);
        return sb.toString();
    }
}