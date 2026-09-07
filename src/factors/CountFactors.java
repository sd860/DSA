package factors;
public class CountFactors {
    public static int solve(int A) {
        int x = 0;
        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                if (i == A / i) {
                    x++;
                } else {
                    x += 2;
                }
            }
        }
        return x;
    }
    public static void main(String[] args) {

        int A = 34;

        System.out.println(solve(A));
    }
}
