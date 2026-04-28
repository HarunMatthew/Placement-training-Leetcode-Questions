class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch>='a'&&ch<='z'){
                stack.push(ch);
            }
            else{
                stack.pop();
            }
        }
        for(char c:stack){
            sb.append(c);
        }
        return sb.toString();
    }
}