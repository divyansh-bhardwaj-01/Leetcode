class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
       set<int>st;
       vector<int>ans;
       for(int i:arr){
        st.insert(i);
       } 
       int count=0;
       int i=1;
       while(i>0){
        if(st.find(i)==st.end()){
            count++;
            ans.push_back(i);
        }
        if(count==k){
            break;
        }
        i++;
       }
       return ans[k-1];
       
    }
};