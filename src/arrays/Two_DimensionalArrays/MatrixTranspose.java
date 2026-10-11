package arrays.Two_DimensionalArrays;
import java.util.ArrayList;
import java.util.Arrays;

public class MatrixTranspose {
    public static ArrayList<ArrayList<Integer>> transpose(ArrayList<ArrayList<Integer>> A) {
        int rows = A.size();
        int cols = A.getFirst().size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int j = 0; j < cols; j++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                row.add(A.get(i).get(j));
            }
            result.add(row);
        }
        return result;
    }
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        A.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        A.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        ArrayList<ArrayList<Integer>> result = transpose(A);
        System.out.println("Original Matrix:");
        for (ArrayList<Integer> row : A) {
            System.out.println(row);
        }
        System.out.println("Transpose Matrix:");
        for (ArrayList<Integer> row : result) {
            System.out.println(row);
        }
    }
}