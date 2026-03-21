class Solution {
public:
    int maxProfit(vector<int>& prices) {
           
         int s=INT_MAX;
         int maxprofit=0;
     for(int i=0;i<  prices.size();i++){
        if(prices[i]<s){
         s=prices[i]; 
         }
         
         int profit=prices[i]-s;
         if(profit>maxprofit){
             maxprofit=profit;
             
             
         }
           
         
         
     }   
      return maxprofit;
    }
};