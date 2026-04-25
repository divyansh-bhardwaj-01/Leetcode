class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int count=0;
           String str=String.valueOf(i);
           int num=i;
           while(num!=0){
            int digit=num%10;
            if(digit==0){
            break;   
            }
            else if(i%digit==0){
                count++;
              }
              num=num/10;
           }
           if(count==str.length()){
            ans.add(i);
           }
        }
        return ans;
    }
}