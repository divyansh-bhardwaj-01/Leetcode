class Solution {
    public long gcdSum(int[] nums) {
        int[] maxa=new int[nums.length];
        int[] prefix=new int[nums.length];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
          max=Math.max(max,nums[i]);
          maxa[i]=max;
        }
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int b=maxa[i];
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            prefix[i]=a;
        }

        Arrays.sort(prefix);
        int st=0;
        int end=prefix.length-1;
        long sum=0;
        while(st<=end){
            if(st==end){
                break;
            }
            int a=prefix[st];
            int b=prefix[end];
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            sum=sum+a;
            st++;
            end--;

        }
        return sum;
    }
}