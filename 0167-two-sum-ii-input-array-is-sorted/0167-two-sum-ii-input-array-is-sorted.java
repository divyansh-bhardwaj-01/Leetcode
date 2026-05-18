class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int st=0;
        int end=numbers.length-1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[st]+numbers[end]<target){
                st++;
            }
            else if(numbers[st]+numbers[end]>target){
                end--;
            }
            if(numbers[st]+numbers[end]==target){
                ans[0]=st+1;
                ans[1]=end+1;
            }
        }
        return ans;
    }
}