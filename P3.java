import java.lang.Math;

public class P3 {

    public static boolean isPrime(long n) {

        if (n == 2) return true;
        if (n < 2 || n % 2 == 0) return false;


        long upperBound = Math.round(Math.sqrt(n));
        upperBound++;

        for (int i = 3; i < upperBound; i+=2 ) {
            if (n % i == 0) return false;
        }

        return true;

    }
    public static void main(String args[]) {
        long n = 600851475143L;
        long uBound = Math.round(Math.sqrt(n));
        while (n % uBound != 0 || ! isPrime(uBound)) {
            uBound--;
        }
        System.out.println(uBound);

    }
}
