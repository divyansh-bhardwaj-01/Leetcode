class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> ans;
        ans.push_back(0);
        for(int i = 1; i <= n; i++) {
            int num = i;
            int count = 0;
            while(num > 0) {
                if(num % 2 == 1) {
                    count++;
                }
                num = num / 2;
            }
            ans.push_back(count);
        }

        return ans;
    }
};