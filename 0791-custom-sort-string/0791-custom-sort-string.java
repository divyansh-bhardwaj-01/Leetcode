class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(char i:s.toCharArray()){
           if(order.indexOf(i)==-1){
             sb.append(i); 
           }
           else{
            sb1.append(i);
           }
        }
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<sb1.length();i++){
            char ch=sb1.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        StringBuilder stb=new StringBuilder();
       
       for(int i=0;i<order.length();i++){
        char ch=order.charAt(i);
        if(mp.containsKey(ch)){
            int value=mp.get(ch);
            for(int j=0;j<value;j++){
               stb.append(ch);
            }
        }
       }
       stb.append(sb);
       return stb.toString();
    }
}