class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        String str=sb.toString();
        String[] arr =str.trim().split("\\s+");
        StringBuilder sbb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sbb.append(arr[i]);
            if(i!=0){
                sbb.append(" ");
            }
        }
        return sbb.toString();
         
    }
}