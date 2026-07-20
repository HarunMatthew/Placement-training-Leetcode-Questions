class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(new ArrayList<>(),nums,0,result);
        return result;
    }
    public void backtrack(List<Integer> curr,int[] nums,int start,List<List<Integer>> result){
        result.add(new ArrayList<>(curr));
        for(int i=start;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(curr,nums,i+1,result);
            curr.remove(curr.size()-1);
        }
    }
}