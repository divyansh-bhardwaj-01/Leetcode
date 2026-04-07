class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        int max=INT_MIN;
        int index=0;
        int count=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.size();i++){
            if(nums[i]==max){
                continue;
            }
            else if(nums[i]*2<=max){
                count++;
            }
        }
        if(count==nums.size()-1){
            return index;
        }
        return -1;
    }
};