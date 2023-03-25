
import java.util.*;

public class leargestElementSum {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 6, 9, 4, 6 };
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
