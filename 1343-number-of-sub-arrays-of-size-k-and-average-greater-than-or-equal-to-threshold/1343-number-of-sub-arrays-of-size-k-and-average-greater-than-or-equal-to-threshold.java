class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int[] pref=new int[arr.length];
        pref[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        int value=0;
        for(int i=0;i<=pref.length-k;i++){
            int sum=0;
            if(i==0){
                sum=sum+pref[i+k-1];
            }
            else{
             sum=sum+pref[i+k-1]-pref[i-1];
            }
             if(sum/k>=threshold){
                count++;
             }
        }
        return count;
    }
}