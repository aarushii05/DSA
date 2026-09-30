import java.util.*;

public class FindLargeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = Integer.MIN_VALUE;
        while (n > 0) {
            int rem = n % 10;
            if (m < rem) {
                m = rem;
            }
            n /= 10;
        }
        System.out.print(m);
    }
}
