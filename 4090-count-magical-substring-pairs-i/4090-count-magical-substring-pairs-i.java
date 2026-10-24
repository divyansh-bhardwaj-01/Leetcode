class Solution {
    public int countMagicalPairs(String s) {
        int len=s.length();
        long res=0;
        for(int i=0;i<len-1;i++){
            Map<Integer,Integer> right=new HashMap<>();
            Map<Character,Integer> freq=new HashMap<>();
            int r=0;
            for(int k=i+1;k<len;k++){
                char c=s.charAt(k);
                if(freq.getOrDefault(c,0)==0){
                    r++;
                }
                freq.put(c,freq.getOrDefault(c,0)+1);
                right.put(r,right.getOrDefault(r,0)+1);
            }
            Map<Character,Integer> leftfreq=new HashMap<>();
            int left=0;
            for(int j=i;j>=0;j--){
                char c=s.charAt(j);
                if(leftfreq.getOrDefault(c,0)==0){
                    left++;
                }
                leftfreq.put(c,leftfreq.getOrDefault(c,0)+1);
                res=res+right.getOrDefault(left,0);
            }
        }
        return (int)res;
    }
}