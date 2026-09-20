package prefixsum;

import java.util.ArrayList;
public class RangeSum {

    public static ArrayList<Long> rangeSum(
            ArrayList<Integer> A,
            ArrayList<ArrayList<Integer>> B) {

        ArrayList<Long> result = new ArrayList<>();
        for (int i = 0; i < B.size(); i++) {

            int L = B.get(i).get(0);
            int R = B.get(i).get(1);

            long sum = 0;
            for (int j = L; j <= R; j++) {
                sum = sum + A.get(j);
            }
            result.add(sum);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();

        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<Integer> q1 = new ArrayList<>();
        q1.add(0);
        q1.add(3);

        ArrayList<Integer> q2 = new ArrayList<>();
        q2.add(1);
        q2.add(2);

        B.add(q1);
        B.add(q2);

        System.out.println(rangeSum(A, B));
    }
}