class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),0,candidates,target);
        return result;
    }
    private void backtrack(List<List<Integer>> result,List<Integer> curr,int start,int[] can,int target){
        
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i=start;i<can.length;i++){
            if(target<can[i]){
                break;
            }
            curr.add(can[i]);

            backtrack(result,curr,i,can,target-can[i]);

            curr.remove(curr.size()-1);
        }
    }
}