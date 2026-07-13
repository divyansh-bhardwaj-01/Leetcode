class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int count=0;
        int start=low;
        while(low!=0){
            int digit=low%10;
            count++;
            low=low/10;
        } 
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=count;i++){
           sb.append(i);
        }
        StringBuilder stb=new StringBuilder();
        for(int i=1;i<=count;i++){
            stb.append(1);
        }
        int num=Integer.parseInt(sb.toString());
        int add=Integer.parseInt(stb.toString());
        List<Integer>ans=new ArrayList<>();
        
         while(num<=high){
            if(num>=start && num<=high)
              ans.add(num);
             if(num>high){
                break;
             }
            String s=String.valueOf(num);
            if(s.charAt(s.length()-1)=='9'){
                if(count==9){
                    break;
                }
                sb.append(count+1);
                count++;
                stb.append(1);
                num=Integer.parseInt(sb.toString());
                add=Integer.parseInt(stb.toString());
                
            }
             else{
                num=num+add;
             }
              
         }
         return ans;
    }
}