class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==1){
                list.add(i);
            }
        }
        int ind=0;
        int arr[]=new int[list.size()];
        for(int i:list){
            arr[ind++]=i;
        }
        return arr;
    }
}