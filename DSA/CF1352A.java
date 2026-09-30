import java.util.*;

public class CF1352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            ar.add(b);
        }
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int c = 1;
            int a = ar.get(i);
            int count = 0;
            while (a > 0) {
                int r = a % 10;
                if (r != 0) {
                    r *= c;
                    arr.add(r);
                    count++;
                }
                c *= 10;
                a /= 10;
            }
            System.out.println();
            System.out.println(count);
            for (int val : arr) {
                System.out.print(val + " ");
            }
        }
    }
}
