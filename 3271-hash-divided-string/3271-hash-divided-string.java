class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i=i+k){
            int num=0;
            for(int j=i;j<i+k;j++){
              num=num+s.charAt(j)-'a';
            }
            int value=num%26;
            sb.append((char)(value +'a'));
        }
        return sb.toString();
    }
}