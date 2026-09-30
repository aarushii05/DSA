import java.util.*;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        do {
            int rem = n % 10;
            if (rem % 2 == 0) even++;
            if (rem % 2 != 0) odd++;
            n /= 10;
        } while (n > 0);
        System.out.println("even count:" + even);
        System.out.print("odd count:" + odd);
    }
}
