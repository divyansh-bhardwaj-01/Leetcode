class Solution {
    public int totalNumbers(int[] digits) {
        int count=0;
        List<String>ans=new ArrayList<>();
        Set<String>st=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    StringBuilder sb=new StringBuilder();
                    if(i!=j && j!=k && k!=i){
                        sb.append(digits[i]);
                        sb.append(digits[j]);
                        sb.append(digits[k]);
                    }
                   if(sb.length()==3){
                    if(sb.charAt(0)!='0'){
                        ans.add(sb.toString());
                    }
                   }
                }  
            }
        }
        for(String i:ans){
            st.add(i);
        }
        for(String i:st){
            int num=Integer.valueOf(i);
            if(num%2==0) count++;
        }

        return count;
    }
}