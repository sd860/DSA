//Sub array in a given range:
package arrays.subarrays;
import java.util.ArrayList;

public class SubArray {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        ArrayList<Integer> subA = new ArrayList<>();
        for (int i = B; i <= C; i++) {
            subA.add(A.get(i));
        }
        return subA;
    }
    public static void main(String[] args) {
        int B = 1;
        int C = 3;

        ArrayList<Integer> A = new ArrayList<>();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        System.out.println(solve(A, B, C));
    }
}