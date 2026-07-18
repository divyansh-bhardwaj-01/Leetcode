class Solution {
    public String rearrangeString(String s, char x, char y) {
      StringBuilder sb=new StringBuilder();
        Map<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(mp.containsKey(y)){
                int value=mp.get(y);
                for(int j=1;j<=value;j++){
                    sb.append(y);
                }
                break;
            }
        }
         
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==y){
                continue;
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}