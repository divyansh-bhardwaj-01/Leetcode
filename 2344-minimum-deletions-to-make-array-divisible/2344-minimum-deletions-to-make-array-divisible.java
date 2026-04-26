class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
       
        int gcd=numsDivide[0];
        for (int i=1;i<numsDivide.length;i++) {
            int a=gcd, b=numsDivide[i];
            while (b!=0) {
                int temp =b;
                b=a%b;
                a=temp;
            }
            gcd=a;
        }
       Arrays.sort(nums);
       int count=0;
       for(int i:nums){
          if(gcd%i==0){
            return count;
          }
          
          count++;
       }
         return -1;
    }
}