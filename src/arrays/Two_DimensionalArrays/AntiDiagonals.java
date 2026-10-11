package arrays.Two_DimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
public class AntiDiagonals {

    public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int d = 0; d < 2 * n - 1; d++) {
            ArrayList<Integer> diagonal = new ArrayList<>();
            for (int k = 0; k < n; k++) {
                diagonal.add(0);
            }
            int index = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j == d) {
                        diagonal.set(index, A.get(i).get(j));
                        index++;
                    }
                }
            }
            result.add(diagonal);
        }
        return result;
    }
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        A.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        A.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> result = diagonal(A);
        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
    }
}
