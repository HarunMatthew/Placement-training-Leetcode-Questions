class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),1,k,n,0);
        return result;
    }
    private void backtrack(List<List<Integer>> result,List<Integer> curr,int start,int k,int n,int sum){
        
        if(curr.size()==k && sum==n){
            result.add(new ArrayList<>(curr));
            
            return;
        }
        
        for(int i=start;i<=9;i++){
            curr.add(i);
            
            backtrack(result,curr,i+1,k,n,sum+i);
            
            curr.remove(curr.size()-1);
        }
    }
}