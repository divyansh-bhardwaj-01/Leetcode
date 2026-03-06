class Solution {
public:
    int maximumPrimeDifference(vector<int>& nums) {
        vector<int>ans;
      for(int i=0;i<nums.size();i++){
        int count=0;
        for(int j=1;j<=nums[i];j++){
         if(nums[i]%j==0){
            count++;
         }
      }
      if(count==2){
        ans.push_back(i);
      }
    }

      int a=ans[0];
      int b=ans[ans.size()-1];
      return (b-a);
         
    }
};