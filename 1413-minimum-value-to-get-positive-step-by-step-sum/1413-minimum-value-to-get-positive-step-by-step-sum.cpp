class Solution {
public:
    int minStartValue(vector<int>& nums) {
        int num=1;  
        while(num>0){
            int count=0;
            int sum=num;
            for(int i=0;i<nums.size();i++){
              sum=sum+nums[i];
              if(sum<1){
                count++;
              }
            }
            if(count>0){
                num=num+1;
            }
            if(count==0){
                return num;
            }
        }
        return 0;
    }
};