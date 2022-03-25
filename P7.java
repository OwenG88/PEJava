public class P7 {
    public static void main(String args[]) {
        int primeCounter = 0;
        for (int i = 0; i < 10e6; i++) {
            if (P3.isPrime(i)) primeCounter++;
            if (primeCounter == 10001) {
                System.out.println(i);
                break;
            }
        }
    }
}
    

