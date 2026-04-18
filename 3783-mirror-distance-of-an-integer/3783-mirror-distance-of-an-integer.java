class Solution {
    public int mirrorDistance(int n) {
        String s=String.valueOf(n);
        int num=0;
        for(int i=s.length()-1;i>=0;i--){
           num=num*10+(s.charAt(i)-'0'); 
        }
        return Math.abs(num-n);
    }
}