package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxArray {
    public static int solve(ArrayList<Integer> A) {
        int n = A.size();
        if (n == 0) {
            return 0;
        }
        int min = A.get(0);
        int max = A.get(0);

        for (int i = 0; i < n; i++) {

            if (A.get(i) < min) {
                min = A.get(i);
            }
            else if (A.get(i) > max) {
                max = A.get(i);
            }
        }
        return min + max;
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
        int result = solve(A);
        System.out.println("Sum of minimum and maximum: " + result);

        sc.close();
    }
}