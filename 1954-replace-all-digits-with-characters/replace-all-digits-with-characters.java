class Solution {
    public String replaceDigits(String s) {
        char arr[]=s.toCharArray();
        for(int i=1;i<arr.length;i+=2){
            int temp=arr[i]-'0';
            arr[i]=(char)(arr[i-1]+temp);
        }
    
        return new String(arr);
    }
}