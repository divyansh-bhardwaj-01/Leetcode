class Solution {
    public int compress(char[] chars) {
        Map<Character,Integer>mp=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            mp.put(ch,mp.getOrDefault(ch,0)+1);
            if(i==chars.length-1 || chars[i+1]!=ch){
                sb.append(ch);
                if(mp.get(ch)>1){
                    sb.append(mp.get(ch));
                }
                mp.clear();
            }
             
        }
        for(int i=0;i<sb.length();i++){
           chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}