class Solution {
    public int maxProduct(int n) {
       ArrayList<Integer>ans=new ArrayList<>();
        while(n!=0){
            int digit=n%10;
            ans.add(digit);
            n=n/10;
        }
        Collections.sort(ans);
        return ans.get(ans.size()-1)*ans.get(ans.size()-2);
        
    }
}