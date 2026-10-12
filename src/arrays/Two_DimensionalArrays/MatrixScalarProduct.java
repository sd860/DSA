package arrays.Two_DimensionalArrays;
import java.util.ArrayList;
import java.util.Arrays;
public class MatrixScalarProduct {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        int rows = A.size();
        int cols = A.getFirst().size();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value = A.get(i).get(j);
                A.get(i).set(j, value * B);
            }
        }
        return A;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        A.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        A.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        int B = 2;
        ArrayList<ArrayList<Integer>> result = solve(A, B);
        System.out.println("Matrix after scalar multiplication:");
        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
    }
}