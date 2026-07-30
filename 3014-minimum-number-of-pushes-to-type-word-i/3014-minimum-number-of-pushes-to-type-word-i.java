class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        if(word.length()<8){
            return word.length();
        }
        int ans=0;
        int count=0;
        int j=1;
        for(int i=1;i<=word.length();i++){
            count++;
            ans=ans+1*j;
          if(count==8){
            count=0;
            j++;
          }

        }
        return ans;
    }
}