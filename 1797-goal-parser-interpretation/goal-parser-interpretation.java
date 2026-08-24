class Solution {
    public String interpret(String command) {
        String s = command;
        String temp = "";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='(' && s.charAt(i+1)==')'){
                temp = temp+"o";
            }
            else{
                temp = temp + s.charAt(i);
            }
        }
        if(s.charAt(s.length()-1) != '(' && s.charAt(s.length()-1) != ')'){
            temp = temp + s.charAt(s.length()-1);
        }
        temp = temp.replaceAll("\\)","");
        temp = temp.replaceAll("\\(","");
        
        return temp;
    }
}