public class FindSecondLeargest {
    public static void main(String[] args) {
        int arr[] = { 7, 5, 3, 4, 8 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("The second Leargest number is : " + arr[n - 2]);
    }
}
