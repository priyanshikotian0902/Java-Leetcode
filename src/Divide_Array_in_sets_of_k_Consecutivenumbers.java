import java.util.*;

public class Divide_Array_in_sets_of_k_Consecutivenumbers {



        public boolean isPossibleDivide(int[] nums, int k) {
            if (nums.length % k != 0) {
                return false;
            }

            TreeMap<Integer, Integer> count = new TreeMap<>();
            for (int card : nums) {
                count.put(card, count.getOrDefault(card, 0) + 1);
            }

            while (!count.isEmpty()) {
                int first = count.firstKey();
                for (int i = 0; i < k; ++i) {
                    int current = first + i;
                    if (!count.containsKey(current) || count.get(current) == 0) {
                        return false;
                    }
                    count.put(current, count.get(current) - 1);
                    if (count.get(current) == 0) {
                        count.remove(current);
                    }
                }
            }

            return true;
        }
public static void main(String[] args) {
            Divide_Array_in_sets_of_k_Consecutivenumbers nums = new Divide_Array_in_sets_of_k_Consecutivenumbers();
            System.out.println(nums.isPossibleDivide(new int[]{1, 2, 3, 4, 5,7}, 2));

}



}
