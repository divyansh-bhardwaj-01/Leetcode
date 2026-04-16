class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            int sum1=0;
            int sum2=0;
            String s=String.valueOf(i);
         if(s.length()%2==0){
            for(int j=0;j<s.length()/2;j++){
              sum1=sum1+s.charAt(j)-'0';
            }
            for(int k=s.length()/2;k<s.length();k++){
                sum2=sum2+s.charAt(k)-'0';
            }
            if(sum1==sum2){
                count++;
            }
          }
        }
        return count;
    }
}