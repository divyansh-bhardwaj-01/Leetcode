class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        vector<int>ans;
        ans.push_back(0);
        if(gain.size()==0){
            return 0;
        }
        ans.push_back(gain[0]);

        for(int i=1;i<gain.size();i++){
          int num=gain[i]+ans[i];
          ans.push_back(num);
        }

         
        int max=INT_MIN;
        for(int i=0;i<ans.size();i++){
           if(max<ans[i]){
            max=ans[i];
           }
        }
        return max;
    }
};