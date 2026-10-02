//Special Subsequence "AG " string return answer MOD 10^9 +7
package arrays.special_subsequence;

public class SpecialAG {

    public static int solve(String A) {

        long countA = 0;
        long countAG = 0;
        long MOD = 1000000007;
        for (int i = 0; i < A.length(); i++) {

            if (A.charAt(i) == 'A') {
                countA++;
            }
            if (A.charAt(i) == 'G') {
                countAG = (countAG + countA) % MOD;
            }
        }
        return (int) countAG;
    }
    public static void main(String[] args) {

        String A = "ABCGAGAGAGAGA";
        System.out.println(solve(A));
    }
}