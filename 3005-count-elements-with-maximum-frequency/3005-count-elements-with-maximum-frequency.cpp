class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        map<int,int>mp;
        for(int i:nums){
            mp[i]++;
        }
        int maxfreq=0;
        for(auto i:mp){
          maxfreq=max(maxfreq,i.second);
        }
        int sum=0;
        for(auto i:mp){
            if(i.second==maxfreq){
                sum=sum+i.second;
            }
        }
        return sum;
    }
};