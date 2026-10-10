class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
       Map<String,String>mp=new HashMap<>();
         for (int i = 0; i < knowledge.size(); i++) {
            mp.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }

        ArrayList<String>ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          sb.append(ch);
          if(ch==')' || ch!='(' && (i+1==s.length() || s.charAt(i+1)=='(')){
            ans.add(sb.toString());
            sb.setLength(0);
          }
        }

        for(int i=0;i<ans.size();i++){
            String str=ans.get(i);
            if(str.startsWith("(")){
                str=str.replace("(","").replace(")","");
                if(mp.containsKey(str)){
                   ans.set(i,mp.get(str));
                }
                else{
                    ans.set(i,"?");
                }
            }
        }

         String res=String.join("",ans);
         return res;
    }
}