class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row=matrix.length;
        int column=matrix[0].length;
        int arr[]=new int[row*column];
        int ind=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[ind++]=matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}