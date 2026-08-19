class Solution {
    public int subsetXORSum(int[] nums) {
        int sum=0;
        List<List<Integer>> result= new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),result);
        for(List<Integer> i:result){
            int curr=0;
            for(int s:i){
                curr=curr^s;
            }
            sum=sum+curr;
        }
        return sum;
    }
    public void backtrack(int[] nums,int start,List<Integer> curr,List<List<Integer>> result){
        result.add(new ArrayList<>(curr));

        for(int i=start;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(nums,i+1,curr,result);
            curr.remove(curr.size()-1);
        }
    }
}