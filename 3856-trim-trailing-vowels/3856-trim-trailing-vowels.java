class Solution {
    public String trimTrailingVowels(String s) {

        StringBuilder str=new StringBuilder(s);
         for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                str.deleteCharAt(i);
            }
            else{
                break;
            }
        }
      return str.toString();
    }
}