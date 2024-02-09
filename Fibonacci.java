public class Fibonacci {
    public static void main(String[] args) {
        int a = -1, b = 1, c = 0, n = 13;
        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.print(String.format("%s ", c));
            a = b;
            b = c;
        }
    }
}
