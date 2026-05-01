class Solution {
    public long removeZeros(long n) {
        String str=String.valueOf(n);
        String st=str.replace("0","");
        return Long.parseLong(st);
    }
}