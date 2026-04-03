class Solution {
public:
    bool canBeEqual(string s1, string s2) {
        for(int i=0;i<s1.length();i++){
            if(s1[i]!=s2[i]){
               for(int j=0;j<s2.length();j++){
                if((j-i)==2){
                    swap(s2[i],s2[j]);
                }
               }
            }
        }
        if(s1==s2){
            return true;
        }
        return false;
    }
};