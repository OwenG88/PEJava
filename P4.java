

public class P4 {
    public static void main(String args[]) {
        for (Integer i = 999; i > 0; i--) {
            for (Integer j = 999; j > i; j--) {
                String s = Integer.toString(i*j);
                String reversed = new StringBuilder(s).reverse().toString();
                if (s.equals(reversed)) {
                    if (i*j > 900000) {
                        System.out.println(s);
                    }
                }
            }
        }
    }
}
