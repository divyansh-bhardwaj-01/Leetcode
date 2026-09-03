class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            min=Math.min(min,nums1[i]);
        }
        int[] arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==min) arr[i]=nums1[i];
            else{
                   if(min%2!=0){
                      if(nums1[i]%2==0) arr[i]=nums1[i]-min;
                      else arr[i]=nums1[i];
                   }
                   if(min%2==0){
                       if(nums1[i]%2!=0) arr[i]=nums1[i]-min;
                       else arr[i]=nums1[i];
                   }
                 } 
        }
        int ocount=0;
        int ecount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) ecount++;
            else ocount++;
        }
        if(ecount==nums1.length || ocount==nums1.length) return true;
        return false;
    }
}