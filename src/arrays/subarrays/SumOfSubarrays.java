package arrays.subarrays;
import java.util.ArrayList;
public class SumOfSubarrays {
    public static long solve(ArrayList<Integer> A) {

        long totalSum = 0;
        int n = A.size();
        for (int i = 0; i < n; i++) {
            long contribution =
                    (long) A.get(i) * (i + 1) * (n - i);
            totalSum = totalSum + contribution;
        }
        return totalSum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();

        A.add(1);
        A.add(2);
        A.add(3);
        System.out.println(solve(A));
    }
}
