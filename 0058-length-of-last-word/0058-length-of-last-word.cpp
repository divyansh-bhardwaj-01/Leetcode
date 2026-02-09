class Solution {
public:
    int lengthOfLastWord(string s) {
        int count=0;
        for(int i=0;i<s.length();i++){
        if(!s.empty() && s.back()==' '){
            s.pop_back();
        }
        }
        for(int i=0;i<s.length();i++){
             
            if(s[i]==' ' || s[i]=='\n'){
               
                 count=0;
            }
            else{
                count++;
            }
        }
        return count;
    }
};