class Solution {
    public int numSub(String s) {
        int ans=0;
        Map<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ans=ans%1000000007;
            if(ch=='1'){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            ans=ans+mp.get(ch);
            }
            else{
                mp=new HashMap<>();
            }
            
        }
        return ans;
    }
}