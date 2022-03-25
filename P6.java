public class P6 {

    public static int sumOfSquares(int n) {
        return n * (n + 1) * (2*n + 1) / 6;
    }

    public static int squareOfSum(int n) {
        int s = n * (n + 1) / 2;
        return s*s;
    }

    public static void main(String args[]) {
        int n = 100;
        System.out.println(sumOfSquares(n) - squareOfSum(n));


    }
}
