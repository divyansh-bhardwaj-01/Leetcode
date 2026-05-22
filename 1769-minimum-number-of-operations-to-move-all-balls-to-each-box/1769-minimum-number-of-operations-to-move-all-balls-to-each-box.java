class Solution {
    public int[] minOperations(String boxes) {
     char[] arr=boxes.toCharArray();
     int[] nums=new int[arr.length];
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[j]=='1'){
               nums[i]=nums[i]+Math.abs(j-i);
            }
        }
     }  
     return nums; 
    }
}