class Solution {
    public String getPermutation(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        int nums[]=new int[n];
        for(int i=1;i<=n;i++){
            nums[i-1]=i;
        }
        String s="";
        backtrack(result,new ArrayList<>(),nums,new boolean[nums.length]);
        for(int i=0;i<result.size();i++){
            if(i==k-1){
                List<Integer> list = result.get(i);
                for(int j:list){
                    s=s+j;
                }
            }
            
        }
        return s;
    }
    public void backtrack(List<List<Integer>> result,List<Integer> curr,int[] nums,boolean[] visited){
        if(curr.size()==nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            visited[i]=true;
            curr.add(nums[i]);
            backtrack(result,curr,nums,visited);
            curr.remove(curr.size()-1);
            visited[i]=false;
        }
    }
}