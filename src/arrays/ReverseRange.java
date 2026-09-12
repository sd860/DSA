package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseRange {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {

        int i =B;
        int j = C;
        while(i<j){
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
            i++;
            j--;
        }
        return A;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        System.out.println("Enter no of array A elements: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n +" elements in array A: ");
        for(int i=0;i<n;i++){
            A.add(sc.nextInt());
        }
        System.out.println("Enter array B element: ");
        int B = sc.nextInt();
        System.out.println("Enter array C element: ");
        int C = sc.nextInt();

        ArrayList<Integer> result = solve(A,B,C);
        System.out.println("The reversed array is:"+result);
        sc.close();
    }
}
