public class Single_Number_III {

        public int[] singleNumber(int[] nums) {
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                res ^= nums[i];
            }

            int count = 0;
            int mask = 1;


            while ((res & mask) == 0)
            {
                count++;
                mask = 1 << count;
            }

            int num1 = 0;
            int num2 = 0;


            for (int k = 0; k < nums.length; k++)
            {
                if ((nums[k] & mask) == 0) {
                    num1 ^= nums[k];
                } else {
                    num2 ^= nums[k];
                }
            }

            return new int[] {num1, num2};
        }

        public static void main(String[] args) {
            Single_Number_III s = new Single_Number_III();
            int[] r=s.singleNumber(new int[]{1,2,1,3,2,5});
            for (int i : r) {
                System.out.println(i);
            }

        }
}
