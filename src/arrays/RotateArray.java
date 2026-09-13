package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateArray {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        B = B % n;

        reverseArray(A, 0, n - 1);
        reverseArray(A, 0, B - 1);
        reverseArray(A, B, n - 1);

        return A;
    }
    public static void reverseArray(ArrayList<Integer> A, int start, int end) {

        for (int i = start, j = end; i < j; i++, j--) {
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();

        System.out.print("Enter no of array A elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements in array A:");
        for (int i = 0; i < n; i++) {
            A.add(sc.nextInt());
        }
        System.out.print("Enter B (number of rotations): ");
        int B = sc.nextInt();

        ArrayList<Integer> result = solve(A, B);

        System.out.println("Array after right rotation: " + result);

        sc.close();
    }
}