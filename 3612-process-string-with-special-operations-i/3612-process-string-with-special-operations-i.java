class Solution {
    public String processStr(String s) {
      StringBuilder sb=new StringBuilder();
      char[] str=s.toCharArray();
      for(int i=0;i<str.length;i++){
        if(str[i]>='a' && str[i]<='z'){
            sb.append(str[i]);
        }
        if(str[i]=='*'){
            if(sb.length()>0)
            sb.deleteCharAt(sb.length()-1);
        }
        if(str[i]=='#'){
            sb.append(sb);
        }
        if(str[i]=='%'){
            sb.reverse();
        }
      }  
      return sb.toString();
    }
}