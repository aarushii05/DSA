import java.util.*;

public class BorrowBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= w; i++) {
            count += (k * i);
        }
        if (count - n <= 0) {
            System.out.print(0);
        } else {
            System.out.print(count - n);
        }
    }
}
