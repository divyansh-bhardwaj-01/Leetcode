class Solution {
    public int numberOfSubstrings(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++){
            Map<Character,Integer>mp=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                mp.put(ch,mp.getOrDefault(ch,0)+1);
                if(mp.get(ch)>=k){
                    count=count+s.length()-j;
                    break;
                }
            }
            mp.clear();
        }
        return count;
    }
}