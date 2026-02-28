class Solution {
public:
    int maximizeExpressionOfThree(vector<int>& nums) {
       sort(nums.begin(),nums.end());
       int sum=nums[nums.size()-1]+nums[nums.size()-2]-nums[0];
       return sum; 
    }
};