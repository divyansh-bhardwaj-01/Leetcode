class Solution {
    public String sortVowels(String s) {
        TreeMap<Character,Integer>mp=new TreeMap<>();
        ArrayList<Character>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' ||ch=='O' ||ch=='U' || ch=='a'|| ch=='e' ||ch=='i'||ch=='o' || ch=='u'){
               mp.put(ch,mp.getOrDefault(ch,0)+1);
            }
        }
        for(char key:mp.keySet()){
            int value=mp.get(key);
            for(int i=0;i<value;i++){
                list.add(key);
            }
        }
        int j=0;
         StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          if(ch=='A' || ch=='E' || ch=='I' ||ch=='O' ||ch=='U' || ch=='a'|| ch=='e' ||ch=='i'||ch=='o' || ch=='u'){
            sb.append(list.get(j));
            j++;
          }
          else{
            sb.append(s.charAt(i));
          }
        }
        return sb.toString();
    }
}