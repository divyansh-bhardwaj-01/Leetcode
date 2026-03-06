class Solution {
public:
    bool checkOnesSegment(string s) {
        int count1=0;
        int count0=0;
        
        for(int i=0;i<s.length();i++){
           if(s[i]=='1'){
            count1++;
           }
           else{
            count0++;
           }
           if(count0>=1 && s[i]=='1'){
            return false;
           }

        }
        return true;
    }
};