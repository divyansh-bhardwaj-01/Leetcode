class Solution {
    public int[] minOperations(String boxes) {
     char[] arr=boxes.toCharArray();
     int[] pref=new int[arr.length];
     int[] suff=new int[arr.length];
        
       int count=0;
       for(int i=1;i<pref.length;i++){
        if(arr[i-1]=='1'){
             count++;
        }
        pref[i]=pref[i-1]+count;
         
       }

         count=0;
       for(int i=arr.length-2;i>=0;i--){
        if(arr[i+1]=='1'){
            count++;
        }
       suff[i]=suff[i+1]+count;
       }
       int[] nums=new int[arr.length];
       for(int i=0;i<arr.length;i++){
        nums[i]=pref[i]+suff[i];
       }
return nums;
    }
}