class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int max1=0;
        int count=0;
       for(int i=0;i<arr.length-1;i++){
        if(i%2!=0 && arr[i]>arr[i+1]){
             count++;
        }
        else if(i%2==0 && arr[i]<arr[i+1]){
            count++;
        }
        else{
            max1=Math.max(max1,count);
            count=0;
        }
       }
       max1=Math.max(max1,count);

       int max2=0;
       count=0;
       for(int i=0;i<arr.length-1;i++){
        if(i%2==0 && arr[i]>arr[i+1]){
             count++;
        }
        else if(i%2!=0 && arr[i]<arr[i+1]){
            count++;
        }
        else{
            max2=Math.max(max2,count);
            count=0;
        }
       } 
       max2=Math.max(max2,count);
       int ans=Math.max(max1,max2);
       return ans+1;
    }
}