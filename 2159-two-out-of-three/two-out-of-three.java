class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        for(int num : nums1) l1.add(num);
        for(int num : nums2) l2.add(num);
        for(int num : nums3) l3.add(num);

        for(int i=1;i<=100;i++){
            int c = 0;
            if(l1.contains(i)) c++;
            if(l2.contains(i)) c++;
            if(l3.contains(i)) c++;

            if(c>=2) res.add(i);
        }

        return res;
    }
}