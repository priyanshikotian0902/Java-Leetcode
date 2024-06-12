public class Reverse_Integer {


        public int reverse(int x) {
            long reverse = 0;
            int temp;

            while (x != 0) {
                reverse = reverse * 10 + x % 10;
                x = x / 10;

                if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                    return 0;
                }
            }

            return (int)reverse;
        }

        public static void main(String[] args) {
            Reverse_Integer obj = new Reverse_Integer();
            System.out.println(obj.reverse(1534236469));
        }
}
