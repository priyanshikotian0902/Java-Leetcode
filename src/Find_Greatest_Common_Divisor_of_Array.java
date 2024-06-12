public class Find_Greatest_Common_Divisor_of_Array {


        public int findGCD(int[] nums) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int num : nums) {
                if (num > max) max = num;
                if (num < min) min = num;
            }

            return gcd(max, min);
        }


        private int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static void main(String[] args) {
            Find_Greatest_Common_Divisor_of_Array obj = new Find_Greatest_Common_Divisor_of_Array();
            System.out.println(obj.findGCD(new int[]{2,5,6,9,10}));
        }

}
