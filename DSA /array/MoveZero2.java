import java.util.*;

public class MoveZero2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr1[i] > 0) {
                arr2.add(arr1[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr1[i] == 0) {
                arr2.add(arr1[i]);
            }
        }
        for (int x : arr2) {
            System.out.print(x + " ");
        }
    }
}
