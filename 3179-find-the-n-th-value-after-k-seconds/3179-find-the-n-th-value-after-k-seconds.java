class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=1;
        }
         
       long[] pref=new long[n];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        for(int i=2;i<=k;i++){
            for(int j=1;j<pref.length;j++){
                pref[j]=(pref[j-1]+pref[j])%1000000007;
            }
        }
 return (int)(pref[pref.length-1]);
    }
}