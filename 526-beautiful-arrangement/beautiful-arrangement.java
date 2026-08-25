class Solution {
    public int countArrangement(int n) {
        int nums[] = new int[n];
        int s = 1;
        for(int i = 0;i<nums.length;i++){
            nums[i] = s++; 
        }
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list,new ArrayList<>(),nums,new boolean[nums.length]);
        System.out.println(list);
        return list.size();
    }
    public void backtrack(List<List<Integer>> list,List<Integer> curr,int[] nums,boolean[] visited){
        if(nums.length == curr.size()){
            list.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            int position = curr.size()+1;
            int num = nums[i];
            if(num % position != 0 && position % num != 0){
                continue;
            }
            visited[i] = true;
            curr.add(nums[i]);
            backtrack(list,curr,nums,visited);
            curr.remove(curr.size()-1);
            visited[i] = false;
        }
    }
}