class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
     set<int>st;
     vector<int>ans;
     vector<int>res;
      
     int count=1;
     for(int i:nums){
        st.insert(i);
     }

     for(int i:st){
        ans.push_back(i);
     }
     if(ans.size()==0){
        return 0;
     }
     for(int i=1;i<ans.size();i++){
        if(ans[i]==ans[i-1]+1){
            count++;
        }
        else{
            res.push_back(count);
            count=1;
        }
        res.push_back(count);
     }
       int max=INT_MIN;
       for(int i=0;i<res.size();i++){
        if(res[i]>max){
            max=res[i];
        }
       }
     if(res.size()==0){
        return count;
     }
     return max;
    }
};