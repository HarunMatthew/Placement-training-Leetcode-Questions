class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);

        }
        Collections.rotate(list,k);
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
    }
}