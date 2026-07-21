class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        if(s.length()==0){
            return result;
        }
        backtrack(result,new ArrayList<>(),s,0);
        return result;
    }
    private void backtrack(List<List<String>> result,List<String> curr,String s,int index){

        if(index==s.length()){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(ispali(index,i,s)){
                curr.add(s.substring(index,i+1));
                backtrack(result,curr,s,i+1);
                curr.remove(curr.size()-1);
            }
        }
        
    }
    private boolean ispali(int left,int right,String s){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}