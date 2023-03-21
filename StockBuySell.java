public class StockBuySell {
    public static void main(String[] args) {
        int arr[] = { 7, 4, 1, 6, 4, 9 };

        int temp = Integer.MAX_VALUE;
        int flag = 0;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
            flag = arr[i] - temp;
            if (ans < flag) {
                ans = flag;
            }
        }
        System.out.println(ans);
    }
}
