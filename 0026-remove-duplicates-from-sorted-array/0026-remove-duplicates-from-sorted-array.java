import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {

        Set<Integer> st = new LinkedHashSet<>();

        for (int i : nums) {
            st.add(i);
        }

        int index = 0;
        for (int i : st) {
            nums[index++] = i;
        }

        return st.size();
    }
}
