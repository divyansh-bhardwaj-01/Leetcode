class Solution {
    public int passwordStrength(String password) {
        int sum=0;
        HashSet<Character>st=new HashSet<>();
        for(char i:password.toCharArray()){
            st.add(i);
        }
        for(char i:st){
            if(i>='a' && i<='z'){
               sum=sum+1;
            }
            else if(i>='A' && i<='Z'){
                sum=sum+2;
            }
            else if(i>='0' && i<='9'){
                sum=sum+3;
            }
            else{
               sum=sum+5;
            }
        }
        return sum;
    }
}