package arrays.Sorting_ArraysProperties;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArithmeticProgression {
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int difference = A.get(1) - A.get(0);
        for (int i = 2; i < A.size(); i++) {
            int currentDifference = A.get(i) - A.get(i - 1);
            if (currentDifference != difference) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(
                Arrays.asList(3, 5, 1)
        );
        int result = solve(A);
        System.out.println("Answer: " + result);
    }
}