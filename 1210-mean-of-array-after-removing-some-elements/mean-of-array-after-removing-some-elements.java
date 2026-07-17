class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int div=n/20;
        double sum=0;
        for(int i=div;i<n-div;i++){
            sum=sum+arr[i];
        }
        return sum/(n-2*div);
    }
}