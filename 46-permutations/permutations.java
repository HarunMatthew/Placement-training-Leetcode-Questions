class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        backtrack(result,new ArrayList<>(),nums,new boolean[nums.length]);
        return result;
    }
    private void backtrack(List<List<Integer>> result,List<Integer> curr,int[] nums,boolean[] used){
        if(curr.size()==nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            curr.add(nums[i]);
            backtrack(result,curr,nums,used);
           curr.remove(curr.size()-1);
           used[i]=false;
        }
    }
}