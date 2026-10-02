package arrays.subarrays;

import java.util.ArrayList;

public class AllSubarrays {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = A.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                ArrayList<Integer> subarray = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subarray.add(A.get(k));
                }
                result.add(subarray);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();

        A.add(1);
        A.add(2);
        A.add(3);

    System.out.println(solve(A));
}
}
