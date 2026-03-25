class Solution {
public:
    int majorityElement(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int ans=nums[0];
        int count=1;
        for(int i=1;i<nums.size();i++){
            if(nums[i]==nums[i-1]){
                count++;
            }

            else{
                 count =1;
                 ans=nums[i];
            }
            if(count>nums.size()/2){
              return ans;
            }
        }
        

          return ans;
    }
   
};