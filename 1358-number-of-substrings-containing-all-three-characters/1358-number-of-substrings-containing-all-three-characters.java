class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character,Integer>mp=new HashMap<>();
        int left=0;
        int n=s.length();
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            while((mp.getOrDefault('a',0)>0) && (mp.getOrDefault('b',0)>0) && (mp.getOrDefault('c',0)>0)){
               ans=ans+(n-i);
               char leftc=s.charAt(left);
               mp.put(leftc,mp.getOrDefault(leftc,0)-1);
               left++;
            }
        }
        return ans;

    }
}