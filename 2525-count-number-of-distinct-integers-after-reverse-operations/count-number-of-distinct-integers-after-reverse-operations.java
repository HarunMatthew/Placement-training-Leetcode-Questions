class Solution {
    public int countDistinctIntegers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);
        }
        for(int j:nums){
            int n=j;
            int rev=0;
            while(n!=0){
                rev=rev*10+(n%10);
                n=n/10;
            }
            list.add(rev);
            
        }
        
        HashSet<Integer> set=new HashSet<>();
        for(int i:list){
            
                set.add(i);
            
            
        }
       
        return set.size();
    }
}