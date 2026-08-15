class Solution {
    public long countVowels(String word) {
        long count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u'){
                count+=(long)(word.length()-i)*(i+1);
            }
        }
         
        return count;
    }
}