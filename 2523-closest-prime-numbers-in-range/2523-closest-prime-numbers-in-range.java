class Solution {
    public int[] closestPrimes(int left, int right) {
       ArrayList<Integer>ans=new ArrayList<>();
       for(int i=left;i<=right;i++){
        int count=0;
        for(int j=2;j*j<=i;j++){
            if(i%j==0){
                count++;
                break;
            }
        }
        if(count==0 && i!=1) ans.add(i);
       } 
       int index=0;
        int min=Integer.MAX_VALUE;
       for(int i=1;i<ans.size();i++){
         if(ans.get(i)-ans.get(i-1)<min){
            min=ans.get(i)-ans.get(i-1);
            index=i;
         }
       }
       if(ans.size()<2)return new int[]{-1,-1};
       
       return new int[] {ans.get(index-1),ans.get(index)};
    }
}