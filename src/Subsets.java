
    import java.util.ArrayList;
import java.util.List;

    public class Subsets {
        List<List<Integer>> res = new ArrayList<>();

        public List<List<Integer>> subsets(int[] nums) {
            findSubsets(nums, 0, new ArrayList<>());
            return res;
        }

        public void findSubsets(int[] nums, int i, List<Integer> sublist) {
            // Base case
            if (i == nums.length) {
                res.add(new ArrayList<>(sublist));  // Add a copy of sublist
                return;
            }

            // Pick case
            sublist.add(nums[i]);
            findSubsets(nums, i + 1, sublist);

            // Remove the last element added to backtrack
            sublist.remove(sublist.size() - 1);

            // No pick case
            findSubsets(nums, i + 1, sublist);
        }

        public static void main(String[] args) {
            Subsets sol = new Subsets();
            int[] nums = {1, 2, 3};
            List<List<Integer>> subsets = sol.subsets(nums);
            System.out.println(subsets);
        }
    }


