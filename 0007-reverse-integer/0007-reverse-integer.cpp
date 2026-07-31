class Solution {
public:
    int reverse(int x) {
        long long reverse = 0;
        long long  digits;
        while (x!= 0) {
            digits = x % 10;
            reverse = (reverse * 10) + digits;
            x = x / 10;
        }
        if (reverse > INT_MAX || reverse < INT_MIN){
            return 0;
    }
        return reverse;
    }
};