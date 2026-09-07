package perfectnumbers;

import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int A = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < A; i++) {
            if (A % i == 0) {
                sum += i;
            }
        }
        if (sum == A) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }
        sc.close();
    }
}
