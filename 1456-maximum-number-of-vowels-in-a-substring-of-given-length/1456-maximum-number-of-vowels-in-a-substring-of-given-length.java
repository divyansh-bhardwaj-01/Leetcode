class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int max=0;
        int count=0;
         Map<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){  
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
            while((i-left+1)>k){
                char lef=s.charAt(left);
                 if(lef=='a' || lef=='e' || lef=='i' || lef=='o' || lef=='u'){
                    count--;
                }
               left++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}