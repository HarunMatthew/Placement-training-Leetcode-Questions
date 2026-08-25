class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();    
        for(int i:nums){
            list.add(i);
        }
        int temp = 0;
        int val = k;
        boolean flag = true;
        while(flag){
            if(list.contains(val)){
                flag = true;
            }
            else{
                flag = false;
                temp = val;
            }

            val = val + k;


        }
        return temp;

        
    }
}