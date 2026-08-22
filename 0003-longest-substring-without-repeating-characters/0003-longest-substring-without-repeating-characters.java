class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=Integer.MIN_VALUE;
        Map<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            for(int j=left;j<=i;j++){
                char c=s.charAt(i);
                char lef=s.charAt(left);
                if(mp.get(c)>1){
                    mp.put(lef,mp.getOrDefault(lef,0)-1);
                    left++;
                }
                else{
                    break;
                }
            }
            max=Math.max(max,i-left+1);
        }
        if(max==-2147483648){
            return 0;
        }
        return max;
    }
}