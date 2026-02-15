class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String st=words[i];
            char[] copy = new char[st.length()];

            int k=0;
            for(int j=st.length()-1;j>=0;j--){
              copy[k]=st.charAt(j);
              k++;
            }
            String reversed=new String(copy);
            if(st.equals(reversed)){
                return reversed;
            }
        }
return "";
    }
}