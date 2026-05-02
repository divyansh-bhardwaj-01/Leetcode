class Solution {
    public int splitNum(int num) {
        String str=String.valueOf(num);
        char[] arr=str.toCharArray();
        StringBuilder num1=new StringBuilder();
        StringBuilder num2=new StringBuilder();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                num1.append(arr[i]);
            }
            else{
                num2.append(arr[i]);
            }
        }
        int Num1=Integer.parseInt(num1.toString());
        int Num2=Integer.parseInt(num2.toString());
        return Num1+Num2;
    }
}