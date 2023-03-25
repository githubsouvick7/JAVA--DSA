public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 2, 7, 9, 6 };
        int k = 7;

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == k) {
                System.out.println(m);
            }
            if (arr[m] < k)
                l = m + 1;
            else
                r = m - 1;
        }
    }
}
