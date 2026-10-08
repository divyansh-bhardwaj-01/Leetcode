class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
       int left1=0;
       int max1=0;
       Map<Character,Integer>mp=new HashMap<>();
       for(int i=0;i<answerKey.length();i++){
        char ch=answerKey.charAt(i);
        mp.put(ch,mp.getOrDefault(ch,0)+1);
        while(ch=='F' && mp.get(ch)>k){
            char lef=answerKey.charAt(left1);
            mp.put(lef,mp.getOrDefault(lef,0)-1);
            left1++;
        }
        max1=Math.max(max1,i-left1+1);
       }
       mp.clear();


       int left2=0;
       int max2=0;
       for(int i=0;i<answerKey.length();i++){
        char ch=answerKey.charAt(i);
        mp.put(ch,mp.getOrDefault(ch,0)+1);
        while(ch=='T' && mp.get(ch)>k){
            char lef=answerKey.charAt(left2);
            mp.put(lef,mp.getOrDefault(lef,0)-1);
            left2++;
        }
        max2=Math.max(max2,i-left2+1);
       }
       int ans=Math.max(max1,max2);
       return ans;
    }
}