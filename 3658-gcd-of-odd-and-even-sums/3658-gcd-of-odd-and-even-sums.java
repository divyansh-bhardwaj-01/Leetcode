class Solution {
    public int gcdOfOddEvenSums(int n) {
        ArrayList<Integer>ans=new ArrayList<>();
         int sum1=0;
         int sum2=0;
         int count=0;
         for(int i=1;i<=1001000;i++){
            if(count>=2*n){
                break;
            }
           if(i%2!=0){
            sum1=sum1+i;
           }
           else{
            sum2=sum2+i;
           }
           count++;
         }
        
        for(int i=1;i<=sum1;i++){
            if(sum1%i==0 && sum2%i==0){
                ans.add(i);
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ans.size();i++){
            if(max<ans.get(i)){
                max=ans.get(i);
            }
        }
        return max;
    }
}