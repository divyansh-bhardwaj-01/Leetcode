class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
       map<int,int>mp;
       vector<int>ans;
       for(int i:nums){
        mp[i]++;
       } 
       multimap<int,int,greater<int>>mm;
       for(auto i:mp){
         mm.insert({i.second,i.first});
       }
       int count=0;
       for(auto i:mm){
         ans.push_back(i.first);
        
       }
       int j=ans[0];
       int sum=0;
       for(int i=0;i<ans.size();i++){
        if(ans[i]==j){
            sum=sum+ans[i];
        }
       }
      return sum;  
    }
};