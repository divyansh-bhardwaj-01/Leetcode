class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int max=INT_MIN;
       
        for(int i=0;i<nums.size();i++){
            if(nums[i]>max){
                max=nums[i];
            }
          
        }
        for(int j=0;j<nums.size();j++){
            if(max==nums[j]){
                return j;
            }
        }
        return -1;
    }
};