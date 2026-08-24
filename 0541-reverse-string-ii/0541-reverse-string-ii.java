class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i=i+2*k){
            for(int j=Math.min(i+k-1,s.length()-1);j>=i;j--){
                sb.append(s.charAt(j));
            }
            for(int j=i+k;j<Math.min(i+2*k,s.length());j++){
                sb.append(s.charAt(j));
            }
        }
        return sb.toString();
    }
}