class Solution {
public:
    int firstMatchingIndex(string s) {
        for(int i=0;i<s.length();i++){
            if(s[i]==s[s.length()-1-i]){
                return i;
            }
        }
        return -1;
    }
};