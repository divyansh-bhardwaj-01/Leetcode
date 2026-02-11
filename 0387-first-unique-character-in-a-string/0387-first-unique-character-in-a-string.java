import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> mp = new HashMap<>();

        for(char i:s.toCharArray()){
           mp.put(i, mp.getOrDefault(i, 0) + 1);

        }
        for(int i=0;i<s.length();i++){
            if(mp.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}