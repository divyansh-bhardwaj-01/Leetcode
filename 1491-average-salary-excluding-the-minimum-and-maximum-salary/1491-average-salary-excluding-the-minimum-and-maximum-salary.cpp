class Solution {
public:
    double average(vector<int>& salary) {
        sort(salary.begin(),salary.end());
        salary.erase(salary.begin());
        salary.erase(salary.end()-1);
        int n=salary.size();
        double sum=0;
        for(int i=0;i<salary.size();i++){
sum=sum+salary[i];
        }
        return sum/n;
    }
};