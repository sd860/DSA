package arrays.subarrays;
import java.util.ArrayList;

public class ClosestMinMax {
    public static int solve(ArrayList<Integer> A) {

        int n = A.size();
        int min = A.get(0);
        int max = A.get(0);
        for (int i = 0; i < n; i++) {
            if (A.get(i) < min) {
                min = A.get(i);
            }
            if (A.get(i) > max) {
                max = A.get(i);
            }
        }
        int lastMin = -1;
        int lastMax = -1;
        int ans = n;
        for (int i = 0; i < n; i++) {
            if (A.get(i) == min) {
                lastMin = i;
                if (lastMax != -1) {
                    ans = Math.min(ans, i - lastMax + 1);
                }
            }
            if (A.get(i) == max) {
                lastMax = i;
                if (lastMin != -1) {
                    ans = Math.min(ans, i - lastMin + 1);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(3);
        A.add(2);
        A.add(1);
        System.out.println(solve(A));
    }
}