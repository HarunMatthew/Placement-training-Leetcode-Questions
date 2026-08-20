class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]%2!=0 && arr[i+1]%2!=0){
                count++;
            }
            else{
                count=1;
            }

            if(count==3){
                return true;
            }
        }
        return false;
    }
}