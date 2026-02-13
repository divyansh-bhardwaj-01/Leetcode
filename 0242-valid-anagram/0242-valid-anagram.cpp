class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length()!=t.length()){
            return false;
        }
        map<char,int>atlas1;
        map<char,int>atlas2;
        for(char i:s){
            atlas1[i]++;
        }

         for(char i:t){
            atlas2[i]++;
        }

        if(atlas1==atlas2){
            return true;
        }
        return false;

    }
};