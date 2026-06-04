class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            int num=i;
            String str=String.valueOf(i);
            for(int j=1;j<str.length()-1;j++){
                if(str.charAt(j-1)<str.charAt(j) && str.charAt(j)>str.charAt(j+1)){
                    count++;
                }
                if(str.charAt(j-1)>str.charAt(j) && str.charAt(j)<str.charAt(j+1)){
                    count++;
                }
            }
        }
        return count;
    }
}