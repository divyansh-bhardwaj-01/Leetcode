class Solution {
    public boolean isPalindrome(String s) {
        s=s.replace(" ","");
         s=s.toLowerCase();
       String result = s.replaceAll("[^a-z0-9]", "");
         
        StringBuilder str=new StringBuilder();
        for(int i=result.length()-1;i>=0;i--){
            str.append(result.charAt(i));
        }
        if(String.valueOf(str).equals(result)){
            return true;
        }
        return false;
    }
}