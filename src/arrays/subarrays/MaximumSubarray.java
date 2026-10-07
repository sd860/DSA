package arrays.subarrays;
import java.util.ArrayList;

public class MaximumSubarray {
    public static int solve(int A, int B, ArrayList<Integer> C) {

        int maxSum = 0;
        for (int i = 0; i < A; i++) {

            int sum = 0;
            for (int j = i; j < A; j++) {
                sum = sum + C.get(j);

                if (sum <= B) {
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {

        int A = 5;
        int B = 12;
        ArrayList<Integer> C = new ArrayList<>();

        C.add(2);
        C.add(1);
        C.add(3);
        C.add(4);
        C.add(5);
        System.out.println(solve(A, B, C));
    }
}