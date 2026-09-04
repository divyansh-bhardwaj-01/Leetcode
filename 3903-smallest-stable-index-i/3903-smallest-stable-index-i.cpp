class Solution {
public:
    int firstStableIndex(vector<int>& nums, int k) {
       int max=INT_MIN;
        int ans=INT_MAX;
        for(int i=0;i<nums.size();i++){
            int min=INT_MAX;
            max=std::max(max,nums[i]);
            for(int j=i;j<nums.size();j++){
                min=std::min(min,nums[j]);
            }
            int temp=max-min;
            if(temp<=k){
                ans=std::min(ans,i);
            }
        }
        if(ans==2147483647) return -1;
        return ans;
    }
};