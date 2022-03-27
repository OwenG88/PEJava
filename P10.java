public class P10 {
    public static void main(String args[]) {
        long s = 0;
        for (int i = 0; i < 2e6; i++) {
            if (P3.isPrime(i)) s+=i;
        }
        System.out.println(s);
    }
}
