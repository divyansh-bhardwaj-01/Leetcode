class Solution {
public:
    int countDigitOccurrences(vector<int>& nums, int digit) {
         int count=0;
         for(int i=0;i<nums.size();i++){   
            int num=nums[i];
            while(num!=0){
                int value=num%10;
                if(value==digit){
                    count++;
                }
                num=num/10;
            }
 
         }
         return count;
    }
};