public class Single_number_II {

        public int singleNumber(int[] nums) {
            int[] bitCount = new int[32];
            int res = 0;


            for (int i = 0; i < 32; i++) {
                int s = 0;
                for (int num : nums) {
                    if ((num & (1 << i)) != 0) {
                        s++;
                    }
                }
                bitCount[i] = s % 3;
            }


            for (int i = 0; i < 32; i++) {
                if (bitCount[i] != 0) {
                    res |= (1 << i);
                }
            }

            return res;
        }

        public static void main(String[] args) {
            Single_number_II s = new Single_number_II();
            System.out.println(s.singleNumber(new int[]{1, 3, 3, 4, 5, 3, 4, 4, 5, 5}));
        }

}
