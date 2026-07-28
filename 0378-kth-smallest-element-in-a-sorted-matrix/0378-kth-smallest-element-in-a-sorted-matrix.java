class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int low=matrix[0][0];
        int n=matrix.length;
        int high=matrix[matrix.length-1][matrix.length-1];
       
        while(low<high){
            int count=0;
            int mid=low+(high-low)/2;
            int row=n-1;
            int col=0;
            while(row>=0 && col<n){
                if(matrix[row][col]<=mid){
                    count=count+row+1;
                    col++;
                }
                else{
                    row--;
                }
            }
            if(count<k){
               low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}