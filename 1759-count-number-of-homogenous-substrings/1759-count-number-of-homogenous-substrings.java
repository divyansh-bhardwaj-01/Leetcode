class Solution {
    public int countHomogenous(String s) {
         int ans=0;
        int count=1;
        for(int i=1;i<s.length();i++){
          if(s.charAt(i)==s.charAt(i-1)){
            count++;
            ans=(ans+count)%1000000007;
          }
          else{
            count=1;
            ans=(ans+count)%1000000007;
          }
        }
        return ans+1;
    }
}