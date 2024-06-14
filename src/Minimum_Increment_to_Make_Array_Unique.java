public class Minimum_Increment_to_Make_Array_Unique {

        public static int minIncrementForUnique(int[] nums) {
            int maxe = Integer.MIN_VALUE;


            for (int n : nums) {
                maxe = Math.max(n, maxe);
            }


            int[] count = new int[maxe + nums.length];
            for (int n : nums) {
                count[n]++;
            }

            int ans = 0;


            for (int i = 0; i < nums.length + maxe; i++) {
                if (count[i] > 1) {
                    count[i + 1] += count[i] - 1;
                    ans += count[i] - 1;

                }
            }

            return ans;
        }

        public static void main(String[] args) {
          System.out.print(minIncrementForUnique(new int[]{1, 2, 2,3,3, 7, 5}));
        }

}
