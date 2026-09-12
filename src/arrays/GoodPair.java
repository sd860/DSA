package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodPair {

    public static int solve(ArrayList<Integer> A, int B) {

        int n = A.size();

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (A.get(i) + A.get(j) == B) {
                    System.out.println("Good Pair Found at: "
                                    + A.get(i) + " + "
                                    + A.get(j) + " = " + B
                    );
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> A = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements:");
        sc.nextLine();
        String input = sc.nextLine();
        String[] values = input.split(" ");

        if (values.length != n) {
            System.out.println("Error: Please enter exactly " + n + " elements.");
            return;
        }
        for (int i = 0; i < n; i++) {
            A.add(Integer.parseInt(values[i]));
        }
        System.out.print("Enter target B: ");
        int B = sc.nextInt();
        int result = solve(A, B);
        System.out.println("Output: " + result);
        sc.close();
    }
}
