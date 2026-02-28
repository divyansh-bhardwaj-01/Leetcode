class Solution {
public:
    int duplicateNumbersXOR(vector<int>& nums) {
        map<int ,int>mp;
        vector<int>ans;
        for(int i:nums){
            mp[i]++;
        }
        for(auto i:mp){
           if(i.second==2){
             ans.push_back(i.first);
            
            } 
        }
        if(ans.size()==0){
           return 0;
        }
        else if(ans.size()==1){
          return ans[0];
        }
             int num=0;
             num=ans[0]^ans[1];
        
             for(int i=2;i<ans.size();i++){
                num=num^ans[i];
            }
        
return num;
    }
};