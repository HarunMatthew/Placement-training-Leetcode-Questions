class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length+nums2.length];
        int temp=0;
        double total=0;
        for(int i=0;i<nums1.length;i++){
            res[temp++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            res[temp++]=nums2[i];
        }
        Arrays.sort(res);
        int diss=res.length/2;
        if(res.length%2==0){
            total=(res[diss]+res[diss-1])/2.0;
        }
        else{
         total=res[diss];
        }
        return total;
    }
}