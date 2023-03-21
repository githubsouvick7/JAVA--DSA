public class Palindrome {
    public static void main(String[] args) {
        String str = "noon";
        String revsstr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revsstr += str.charAt(i);
        }

        if (str.equals(revsstr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
