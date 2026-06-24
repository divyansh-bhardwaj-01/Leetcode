class Solution {
    public boolean detectCapitalUse(String word) {
         int scount=0;
        int bcount=0;
         
        for(int i=0;i<word.length();i++){
          if(word.charAt(i)>=65 && word.charAt(i)<=90){
             bcount++;
          }
          else{
            scount++;
          }
        }
        if(word.length()==bcount){
            return true;
        }
        else if(word.length()==scount){
            return true;
        }
        if(word.charAt(0)>=65 && word.charAt(0)<=90){
             if(word.length()-scount==1){
                return true;
             }
        }
        return false;
    }
}