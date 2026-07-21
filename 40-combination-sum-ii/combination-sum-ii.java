class Solution {
    public List<List<Integer>> combinationSum2(int[] can, int target) {
        Arrays.sort(can);
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),0,can,target,new boolean[can.length]);
        return result;
    }
    private void backtrack(List<List<Integer>> result,List<Integer> curr,int start,int[] can,int target,boolean[] used){
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=start;i<can.length;i++){
            
            
            if(target<can[i]){
                break;
            }
            if(i>start && can[i]==can[i-1]){
                continue;
            }
            curr.add(can[i]);
            backtrack(result,curr,i+1,can,target-can[i],used);
            curr.remove(curr.size()-1);
            
        }
    }
}