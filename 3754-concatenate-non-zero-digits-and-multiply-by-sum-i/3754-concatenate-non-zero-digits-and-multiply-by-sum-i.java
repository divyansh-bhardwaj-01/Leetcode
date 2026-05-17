class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return 0;
        }
        String s=String.valueOf(n);
        String res=s.replace("0","");
        int sum=0;
        for(int i=0;i<res.length();i++){
          sum=sum+(res.charAt(i)-'0');
        }
        Long num=Long.parseLong(res);
        num=num*sum;
        return num;
    }
}