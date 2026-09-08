class Solution {
    public int minLengthAfterRemovals(String s) {
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') a++;
            else b++;
        }
        if(a>b) return a-b;
        return b-a;
    }
}