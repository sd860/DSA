package prime;

public class PrimeNumber {
    public static int solve(int A) {
        int x = 0;
        for (int i = 1; i <= A; i++) {
            if (A % i == 0) {
                x++;
            }
            if (x > 2) {
                return 0;
            }
        }
        if (x == 2) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int A = 7;

        System.out.println(solve(A));
    }
}