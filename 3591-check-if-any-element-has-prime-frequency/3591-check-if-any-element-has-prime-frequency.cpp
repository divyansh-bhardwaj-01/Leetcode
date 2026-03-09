class Solution {
public:
    bool checkPrimeFrequency(vector<int>& nums) {
        map<int,int>mp;
        vector<int>ans;
        for(int i:nums){
            mp[i]++;
        }
        for(auto i:mp){
            ans.push_back(i.second);
        }
        
        for(int i=0;i<ans.size();i++){
            int count=0;
            for(int j=1;j<=ans[i];j++){
                if(ans[i]%j==0){
                    count++;
                }
            }
            if(count==2){
                return true;
            }
        }
        return false;
    }
};