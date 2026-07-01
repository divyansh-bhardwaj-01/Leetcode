class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int count=0;
        char ch=(char)('0'+x);
        for(int i=0;i<nums.length;i++){
            long sum=0;
            StringBuilder sb=new StringBuilder();
            for(int j=i;j<nums.length;j++){
              sum=sum+nums[j];
              sb.append(sum);
               if(sb.charAt(0)==ch && sb.charAt(sb.length()-1)==ch){
                count++;
               }   
               sb.setLength(0);
            }
        }
        return count;
    }
}