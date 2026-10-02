class Solution {
public:
    int maximumSwap(int num) {
        string s=to_string(num);
        for(int i=0;i<s.size();i++){
            int index=i;
            for(int j=i+1;j<s.size();j++){
                if(s[j]>=s[index]){
                    index=j;
                }
            }
            if(s[index]>s[i]){
                swap(s[i],s[index]);
                break;
            }
        }
        return stoi(s);
    }
};