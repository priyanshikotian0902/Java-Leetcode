import java.util.Arrays;

public class Counting_Primes {

        public int countPrimes(int n) {
            if (n <= 2) return 0;

            boolean[] isPrime = new boolean[n];
            Arrays.fill(isPrime, true);
            isPrime[0] = false;
            isPrime[1] = false;

            for (int i = 2; i * i < n; i++) {

                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;

                }
            }

            int ans = 0;
            for (int k = 2; k < n; k++) {
                if (isPrime[k]) {
                    ans++;
                }
            }

            return ans;
        }

        public static void main(String[] args) {
            Counting_Primes cp = new Counting_Primes();
            System.out.println(cp.countPrimes(39));
        }

}
