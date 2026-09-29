package prefixsum;
import java.util.ArrayList;
public class InLine {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        for (int i = 1; i < A.size(); i++) {
            A.set(i, A.get(i) + A.get(i - 1));
        }
        return A;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        ArrayList<Integer> result = solve(A);
        System.out.println(result);
    }
}
