import java.util.*;

public class PrintMinMax {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 7, 9, 7, 8, 0, 3, 10};
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        int n = arr.length;

        int max = arr[0];
        int smax = -1;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                smax = max;
                max = arr[i];
            }
        }
        System.out.print(smax);
    }
}
