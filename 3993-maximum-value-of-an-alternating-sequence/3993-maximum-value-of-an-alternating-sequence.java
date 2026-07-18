class Solution {
    public long maximumValue(int n, int s, int m) {
        long N=n, S=s, M=m;
        if (N == 1) return S;
        long num = S+(N/2)*(M-1)+1;
        return num;
    }
}