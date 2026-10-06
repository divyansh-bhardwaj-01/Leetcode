class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=Integer.MIN_VALUE;
        Map<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            while(mp.get(ch)>1){
             char lef=s.charAt(left);
             mp.put(lef,mp.getOrDefault(lef,0)-1);
             left++;
            } 
            max=Math.max(max,i-left+1);
        }
        if(max==-2147483648){
            return 0;
        }
        return max;
    }
}