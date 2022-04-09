public class P12 {

    public static int nDivisors(long n) {

        if (n == 1) return 1;

        long upperBound = Math.round(Math.sqrt(n));
        upperBound++;
        int count = 2;

        for (int i = 2; i < upperBound; i++) {
            if (n % i == 0) count+=2;
        }

        return count;

    }

    public static long triangular(long n) {
        return n * (n + 1) / 2;
    }

    public static void main(String args[]) {
        int i = 1;
        while (nDivisors(triangular(i)) <= 500) i++;
        System.out.println(triangular(i));

    }
    
}
