import java.util.*;

public class Pythagorian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        if (i * i == (j * j) + (k * k)) {
            System.out.print("pythgorous");
        } else {
            System.out.print("not pythgorous");
        }
    }
}
