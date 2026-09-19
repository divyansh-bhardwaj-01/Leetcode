class Solution {
     public boolean isPalindrome(String s, int left, int right) {
        while (left<right) {
            if (s.charAt(left)!=s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public int maxPalindromes(String s, int k) {
        int count = 0;
        for (int i=0;i<=s.length()-k;i++) {
            if (isPalindrome(s,i,i+k-1)) {
                count++;
                i=i+k-1;
            }
            else if (i+k<s.length() && isPalindrome(s,i,i+k)){
                count++;
                i=i+k;
            }
        }
        return count;
    }
}
