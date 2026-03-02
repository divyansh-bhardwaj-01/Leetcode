class Solution {
public:
    string trimTrailingVowels(string s) {
        for(int i=s.length()-1;i>=0;i--){
            if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u'){
                s.erase(i,1);
            }
            else{
                break;
            }
        }
        return s;
    }
};