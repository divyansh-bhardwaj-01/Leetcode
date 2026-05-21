class Solution {
    public int maxProduct(int[] nums) {
        int[] pref=new int[nums.length];
        int[] suff=new int[nums.length];
        pref[0]=nums[0];
        suff[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            if(pref[i-1]==0){
                pref[i]=nums[i];
            }
            else{
                  pref[i]=pref[i-1]*nums[i];
            }        
        }
        for(int i=nums.length-2;i>=0;i--){
            if(suff[i+1]==0){
             suff[i]=nums[i];
            }
            else{
         suff[i]=suff[i+1]*nums[i];
            }
        }
        int max=Integer.MIN_VALUE;

        for(int i=0;i<pref.length;i++){
          if(pref[i]>max){
            max=pref[i];
          }
        }

        int max2=Integer.MIN_VALUE;
        for(int i=0;i<suff.length;i++){
          if(suff[i]>max2){
            max2=suff[i];
          }
        }
       
         if(max>max2){
            return max;
        }
        else{
            return max2;
        }
          
         
    }
}