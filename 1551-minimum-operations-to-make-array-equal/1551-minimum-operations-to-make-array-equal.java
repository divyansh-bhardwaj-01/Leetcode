class Solution {
    public int minOperations(int n) {
         int[] arr=new int[n];
      int x=0;
      int diff=0;
       for(int i=0;i<n;i++){
         arr[i]=(2*i)+1; 
      }  
      int mid=arr.length/2;
       
       for(int i=0;i<arr.length;i++){
          diff=diff+Math.abs(arr[mid]-arr[i]);
       }
       return diff/2;
    }
}