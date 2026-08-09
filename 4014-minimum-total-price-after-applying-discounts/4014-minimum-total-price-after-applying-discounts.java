class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double num=0;  
        Arrays.sort(prices);
        Arrays.sort(discounts);
      for (int i = 0, j = prices.length - 1; i < j; i++, j--) {
         int temp = prices[i];
         prices[i] = prices[j];
         prices[j] = temp;
       }

        for (int i = 0, j = discounts.length - 1; i < j; i++, j--) {
         int temp = discounts[i];
         discounts[i] = discounts[j];
         discounts[j] = temp;
       }


       if(prices.length>=discounts.length){
        for(int i=0;i<discounts.length;i++){
          num=num+(prices[i]*(100-discounts[i]))/100.0;
        }
        for(int i=discounts.length;i<prices.length;i++){
            num=num+prices[i];
        }
       }
       else{
        for(int i=0;i<prices.length;i++){
          num=num+(prices[i]*(100-discounts[i]))/100.0;
        }
       }
        return num;
    
    }
}