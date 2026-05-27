class Solution {
    public String findDifferentBinaryString(String[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        int len=0;
        for(int i=0;i<nums.length;i++){
            len=nums[i].length();
            int num = Integer.parseInt(nums[i], 2);
            ans.add(num);
        }
        int num=-1;
        Collections.sort(ans);
        for(int i=0;i<ans.size();i++){
          if(ans.get(i)!=i){
            num=i;
            break;
          }
        }
        if(num==-1){
            num=ans.size();
        }
       
        String binary = Integer.toBinaryString(num);
        for(int i=1;i<=len;i++){
            if(binary.length()!=len){
                binary="0"+binary;
            }
        }
        return binary;
    }
}