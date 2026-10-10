package arrays.Two_DimensionalArrays;

public class ColumnSum {
    public static int[] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int [] result = new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j] += A[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] A = {
                {1,2,3,4},
                {5,6,7,8},
                {9,2,3,4},
        };
        int[] result = solve(A);
        System.out.print("Column Sum: ");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
