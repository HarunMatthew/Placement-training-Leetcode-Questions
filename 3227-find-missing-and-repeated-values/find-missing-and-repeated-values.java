class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[]=new int[2];
        HashSet<Integer> set=new HashSet<>();
        int r=grid.length;
        int c=grid[0].length;
        int total=r*c;
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int n=grid[i][j];
                if(set.contains(n)){
                    arr[0]=n;
                }
                set.add(n);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum=sum+grid[i][j];
            }
        }
        int total1=total*(total+1)/2;
        arr[1]=total1-sum+arr[0];

        return arr;

    }
}