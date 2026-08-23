class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
         for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             sb1.append(String.format("%8s",Integer.toBinaryString(ch)).replace(' ','0'));
             
         }
        String s1=sb1.toString();
        String s2=sb1.reverse().toString();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}