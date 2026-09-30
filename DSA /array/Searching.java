import java.util.*;

public class Searching {
    static void findT(ArrayList<Integer> arr, int t) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            if (t == arr.get(i)) {
                System.out.print("Target found at indx :" + i);
                return;
            }
        }
        System.out.print("Not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 5, 7, 89, 3, 2));
        System.out.print("Enter the taget to be find:");
        int target = sc.nextInt();
        findT(arr, target);
    }
}
