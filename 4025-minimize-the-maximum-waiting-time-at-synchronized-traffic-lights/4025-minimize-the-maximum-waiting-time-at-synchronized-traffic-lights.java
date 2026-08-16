class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
       int max=Integer.MIN_VALUE;
       for(int i=0;i<lights.length;i++){
        if(lights[i]>max){
            max=lights[i];
        }
       } 
       int maxi=0;
       for(int i=0;i<arrivalTime.length;i++){
        int num=arrivalTime[i]%period;
        if(num>=max){
           maxi=Math.max(maxi,period-num);
        }
       }
       return maxi;
    }
}