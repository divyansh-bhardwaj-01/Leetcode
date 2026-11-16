class Solution {
    public String digitSum(String s, int k) {
        int len=s.length();
        while(len>k){
            StringBuilder sb=new StringBuilder();
            int count=0;
            int sum=0;
            for(int i=0;i<len;i++){
                char ch=s.charAt(i);
              sum=sum+(ch-'0');
              count++;
              if(count==k){
                sb.append(sum);
                count=0;
                sum=0;
              }
              else if(count!=k && i==len-1){
                sb.append(sum);
              }
            }
            s=sb.toString();
            len=sb.length();
        }
        return s;
    }
}