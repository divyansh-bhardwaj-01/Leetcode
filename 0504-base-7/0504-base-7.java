class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int n=num;
        if(num<0){
            sb2.append("-");
        }
        num=Math.abs(num);
        while(num!=0){
           int digit=num%7;
           sb.append(digit);
           num=num/7;
        }
        if(n<0){
            for(int i=sb.length()-1;i>=0;i--){
                sb2.append(sb.charAt(i));
            }
        }
        String rev=sb.reverse().toString();
        if(n<0){
            return sb2.toString();
        }
        
        return rev;
        
    }
}