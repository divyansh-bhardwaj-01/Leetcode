class Solution {
    public void rotate(int[][] matrix) {
       int[][] nums=new int[matrix.length][matrix[0].length];
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            nums[j][i]=matrix[i][j];
        }
       } 
        int[][] arr=new int[matrix.length][matrix[0].length];
       for(int i=0;i<nums.length;i++){
         int k=0;
        for(int j=nums[0].length-1;j>=0;j--){
            arr[i][k]=nums[i][j];
            k++;
        }
       }
       
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            matrix[i][j]=arr[i][j];
        }
       }
    }
}