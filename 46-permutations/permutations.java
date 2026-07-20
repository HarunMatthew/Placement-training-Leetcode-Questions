class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums,result,new ArrayList<>());
        return result;
    }
    public void backtrack(int[] nums,List<List<Integer>> result,List<Integer> curr){
        if(curr.size()==nums.length){
            result.add(new ArrayList<>(curr));
        }
        for(int num:nums){
            if(curr.contains(num)){
                continue;
            }
            curr.add(num);
            backtrack(nums,result,curr);
            curr.remove(curr.size()-1);
        }
    }
}