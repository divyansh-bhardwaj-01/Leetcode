class Solution {
public:
    int getMinDistance(vector<int>& nums, int target, int start) {
        int min=INT_MAX;
        for(int i=0;i<nums.size();i++){
            int num;
            if(target==nums[i]){
              num=abs(i-start);
                if(min>num){
                  min=num;
                }
            }
        }
        return min;
    }
};