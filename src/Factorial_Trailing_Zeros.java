public class Factorial_Trailing_Zeros {

        public int trailingZeroes(int n) {
            int res=0;
            for(int i=5;i<=n;i=i*5)
            {
                res=res+(n/i);
            }
            return res;
        }


        public static void main(String[] args) {
            Factorial_Trailing_Zeros ft = new Factorial_Trailing_Zeros();
            System.out.println(ft.trailingZeroes(30));
        }
}
