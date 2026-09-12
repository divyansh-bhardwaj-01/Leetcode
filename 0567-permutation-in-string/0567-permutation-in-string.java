class Solution {
    public boolean checkInclusion(String s1, String s2) {
       char[] s1arr=s1.toCharArray();
       Arrays.sort(s1arr);
       int k=s1.length();
       for(int i=0;i<=s2.length()-k;i++){
          String sub=s2.substring(i,i+k);
          char[] s2arr=sub.toCharArray();
          Arrays.sort(s2arr);
          if(Arrays.equals(s1arr,s2arr)){
            return true;
          }
       }
       return false;
    }
}