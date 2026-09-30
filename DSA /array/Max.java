import java.util.*;

public class Max {
    static int findM(ArrayList<Integer> arr) {
        int n = arr.size();
        int m = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > m) {
                m = arr.get(i);
            }
        }
        return m;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 5, 7, 89, 3, 2));
        System.out.print(findM(arr));
    }
}
