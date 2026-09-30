import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = true;
                count++;
            }
        }
        if (flag) {
            System.out.print("not prime");
        } else {
            System.out.print("prime");
        }
    }
}
