class Solution {
public:
    string firstPalindrome(vector<string>& words) {
         for(int i=0;i<words.size();i++){
            string temp=words[i];
            char dupli[1000];
            int k=0;
            for(int j=temp.length()-1;j>=0;j--){
               dupli[k]=temp[j];
               k++;
            }
            dupli[k] = '\0';
            if(temp==dupli){
                return temp;
            }
        }
        return "";
    }
};