class Solution {
    String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        backtrack(result,new StringBuilder(),digits,0);
        return result;
    }
    private void backtrack(List<String> result,StringBuilder sb,String digits,int index){
        if(digits.length()==index){
            result.add(sb.toString());
            return;
        }

        String letter=map[digits.charAt(index)-'0'];
        for(char ch:letter.toCharArray()){
            sb.append(ch);
            backtrack(result,sb,digits,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}