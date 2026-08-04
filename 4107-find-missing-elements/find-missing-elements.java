class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        int start=nums[0];
        int end=nums[nums.length-1];
        int ind=0;
        for(int i=start;i<=end;i++){
            if(nums[ind]==i){
                ind++;
            }
            else{
                list.add(i);
            }
            
        }
        return list;
    }
}