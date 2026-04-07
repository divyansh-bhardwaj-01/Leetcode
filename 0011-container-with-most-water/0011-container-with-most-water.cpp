class Solution {
public:
    int maxArea(vector<int>& height) {
        int max=INT_MIN;
        int st=0;
        int end=height.size()-1;
         while(st<end){
            int wt=end-st;
            int ht=min(height[st],height[end]);
            
            if(ht*wt>max){
                max=ht*wt;
            }
            if(height[st]>height[end]){
                end--;
            }
            else{
                st++;
            }
         }
        return max;
    }
};