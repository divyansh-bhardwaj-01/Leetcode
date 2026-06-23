class Solution {
    public long countSubstrings(String s, char c) {
        long count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        long ans=1;
        ans=count*(count+1)/2;
        return ans;
    }
}