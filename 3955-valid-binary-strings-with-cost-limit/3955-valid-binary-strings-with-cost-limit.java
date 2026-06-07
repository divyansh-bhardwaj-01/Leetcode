class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String>ans=new ArrayList<>();
        int totals=(int)Math.pow(2,n);
        for(int i=0;i<totals;i++){
            String binary=Integer.toBinaryString(i);
            while(binary.length()<n){
                binary="0"+binary;
            }
            int cost=0;
            for(int j=0;j<n;j++){
                if(binary.charAt(j)=='1'){
                    cost=cost+j;
                }
            }
            if(!binary.contains("11") && cost<=k){
                ans.add(binary);
            }
        }
        return ans;
    }
}