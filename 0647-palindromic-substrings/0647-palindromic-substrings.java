class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
             StringBuilder str=new StringBuilder();
                StringBuilder sb=new StringBuilder();   
            for(int j=i;j<s.length();j++){
                str.append(s.charAt(j));
                 sb.append(s.charAt(j));
                 sb.reverse();
                if(str.toString().equals(sb.toString())){
                    count++;
                }
                sb.reverse();
            }
        }
        return count;
    }
}