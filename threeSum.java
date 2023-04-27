public class threeSum {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        int n = arr.length;
        int ans[] = new int[3];

        // Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            int first = i + 1;
            int last = n - 2;

            while (first < last) {
                if (arr[i] + arr[first] + arr[last] == 0) {
                    ans[0] = i;
                    ans[1] = first;
                    ans[2] = last;
                } else if (arr[i] + arr[first] + arr[last] < 0) {
                    last++;
                } else
                    first++;
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
