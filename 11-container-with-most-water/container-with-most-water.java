class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int a=Math.min(height[left],height[right]);
            int width=right-left;
            int sum=a*width;
            max=Math.max(sum,max);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}