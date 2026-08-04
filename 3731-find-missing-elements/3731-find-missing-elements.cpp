class Solution {
public:
    vector<int> findMissingElements(vector<int>& nums) {
       int sm = INT_MAX;
       int mx = INT_MIN;
       set<int> st;
       for(int i:nums){
        sm = min(sm,i);
        mx = max(mx,i);
        st.insert(i);
       }
       vector<int> res;
       for(int i=sm; i<=mx; i++){
        if(st.find(i)==st.end()){
            res.push_back(i);
        }
       }
       return res;
    }
};