class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        char[] parr=p.toCharArray();
        Arrays.sort(parr);
        int k=p.length();
        for(int i=0;i<=s.length()-k;i++){
           String sub=s.substring(i,i+k);
           char[] sarr=sub.toCharArray();
           Arrays.sort(sarr);
           if(Arrays.equals(parr,sarr)) ans.add(i);
        }
        return ans;
    }
}