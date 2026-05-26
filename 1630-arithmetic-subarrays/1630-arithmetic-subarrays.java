class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
         
        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<l.length;i++){
          int[] value=new int[(r[i]-l[i])+1];
          for(int j=l[i];j<=r[i];j++){
             value[j-l[i]]=nums[j];
          }
          int[] arr=new int[value.length-1];
          Arrays.sort(value);
          for(int k=1;k<value.length;k++){
            arr[k-1]=value[k]-value[k-1];
          }
           HashSet<Integer>st=new HashSet<>();
           for(int m:arr){
            st.add(m);
           }
           if(st.size()==1){
            result.add(true);
           }
           else{
            result.add(false);
           }
        }
        return result;
    }
}