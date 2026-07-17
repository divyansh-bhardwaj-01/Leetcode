class Solution {
    public int countCommas(int n) {
         if(n<1000) return 0;
        int count=0;
         for(int i=1000;i<=n;i++){
            String s=String.valueOf(i);
            for(int j=3;j<s.length();j=j+3){
                if(j<s.length()) count++;
            }
         }
         
        return count;
    }
}