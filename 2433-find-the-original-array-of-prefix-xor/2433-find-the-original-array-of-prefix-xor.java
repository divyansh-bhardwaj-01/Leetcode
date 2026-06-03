class Solution {
    public int[] findArray(int[] pref) {
     int[] arr =new int[pref.length];
     arr[0]=pref[0];
     int xor=0;
     for(int i=1;i<pref.length;i++){
         xor=arr[i-1]^xor;
        arr[i]=pref[i]^xor;
     }   
     return arr;
    }
}