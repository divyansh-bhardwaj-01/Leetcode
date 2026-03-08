class Solution {
public:
    int minElement(vector<int>& nums) {
        vector<int>ans;
        for(int i=0;i<nums.size();i++){
            int digit=nums[i];
            int sum=0;
            while(digit!=0){
              int num=digit%10;
              sum=sum+num;
              digit=digit/10;

            }
            ans.push_back(sum);
        }
        int min=INT_MAX;
       for(int i=0;i<ans.size();i++){
         if(ans[i]<min){
            min=ans[i];
         }
       }
      return min;
    }
};