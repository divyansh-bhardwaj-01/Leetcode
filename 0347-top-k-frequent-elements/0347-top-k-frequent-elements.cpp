class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        map<int,int>mp;
        multimap<int,int, greater<int>> mm;
        vector<int>ans;
        for(int i:nums){
            mp[i]++;
        }

 for(auto p : mp){
    mm.insert({p.second, p.first});
}
int count=0;
for(auto i:mm){
    ans.push_back(i.second);
    count++;
    if(count==k){
        break;
    }
}
return ans;
    }
};