public class Margesort {
    public static void conquer(int arr[], int start, int mid, int end) {
        int sortedArray[] = new int[end - start + 1];

        int index1 = start;
        int index2 = mid + 1;
        int k = 0;

        while (index1 < mid && index2 < end) {
            if (arr[index1] <= arr[index2]) {
                sortedArray[k++] = arr[index1++];
            } else {
                sortedArray[k++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            sortedArray[k++] = arr[index1++];
        }

        while (index2 <= end) {
            sortedArray[k++] = arr[index2++];
        }

        for (int i = 0, j = start; i < sortedArray.length; i++, j++) {
            arr[j] = sortedArray[i];
        }
    }

    public static void divide(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;

        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        conquer(arr, start, mid, end);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 7, 8, 9, 1, 2, 4, 5 };
        int n = arr.length;
        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
