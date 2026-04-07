class Solution {
public:
    vector<int> findLonely(vector<int>& nums) {
        map<int,int>mp;
        vector<int>ans;
        for(int i:nums){
            mp[i]++;
        }
        for(auto i:mp){
            if(i.second==1){
                if(mp.find(i.first+1)==mp.end() && mp.find(i.first-1)==mp.end()){
                  ans.push_back(i.first);
                }
            }
        }
        return ans;
    }
};