class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int[] suff=new int[shifts.length];
        suff[suff.length-1]=shifts[shifts.length-1];
        for(int i=shifts.length-2;i>=0;i--){
            suff[i]=(shifts[i]+suff[i+1])%26;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int num=(ch-'a'+suff[i])%26;
             sb.append((char)('a'+num));

        }
        return sb.reverse().toString();
    }
}