public class P2 {

    public static int fib(int n) {
        //Returns the nth fibonacci number
        if (n == 1 || n == 2) return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String args[]) {
        int s = 0;
        int i = 1;
        int f = fib(i);
        while (f < 4000000) {
            if (f % 2 == 0) s += f;
            i++;
            f = fib(i);
        }
        System.out.println(s);
    }
}
