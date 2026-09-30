import java.util.*;

public class VectorSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xf = 0;
        int yf = 0;
        int zf = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            xf += x;
            yf += y;
            zf += z;
        }
        if (xf != 0 || yf != 0 || zf != 0) {
            System.out.print("NO");
        } else {
            System.out.print("YES");
        }
    }
}
