class Solution {
public:
    vector<string> topKFrequent(vector<string>& words, int k) {
     map<string,int>mp;
     vector<string>ans;
     for(string i:words){
        mp[i]++;
     }
     multimap<int,string,greater<int>>mm;
     for(auto i:mp){
        mm.insert({i.second,i.first});
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