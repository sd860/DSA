package arrays.Sorting_And_Selection;
public class KthSmallest {
    public static int solve(int[] A, int B) {
        int n = A.length;
        for (int i = 0; i < B; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = A[i];
                A[i] = A[minIndex];
                A[minIndex] = temp;
            }
        }
        return A[B - 1];
    }
    public static void main(String[] args) {
        int[] A = {2, 1, 4, 3, 2};
        int B = 3;
        int result = solve(A, B);
        System.out.println("Kth smallest element: " + result);
    }
}