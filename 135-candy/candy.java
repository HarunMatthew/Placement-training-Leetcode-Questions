class Solution {
    public int candy(int[] arr) {
       int left[]=new int[arr.length];
       int right[] = new int[arr.length];
        int sum=0;
        left[0]=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                left[i]=left[i-1]+1;
            }
            else{
                left[i]=1;
            }
        }
       
        right[arr.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                
                right[i]=right[i+1]+1;
            }
            else{
                right[i]=1;
                
            }
        }
    
        int tot[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            tot[i]=Math.max(left[i],right[i]);
        }
        
        for(int i:tot){
            sum=sum+i;
        }
        return sum;

    }
}