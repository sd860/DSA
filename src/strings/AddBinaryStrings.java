package strings;
public class AddBinaryStrings {
    public static String addBinary(String A, String B) {
        int i = A.length() - 1;
        int j = B.length() - 1;
        int k = 0;

        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || k > 0) {
            int sum = k;
            if (i >= 0) {
                sum += A.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += B.charAt(j) - '0';
                j--;
            }
            int bit = sum % 2;
            k = sum / 2;

            result.append(bit);
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        String A = "10010110011";
        String B = "11001010";
        String result = addBinary(A, B);
        System.out.println("Binary sum: " + result);
    }
}