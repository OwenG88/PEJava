import java.math.BigInteger;

public class P16 {
    
    public static void main(String args[]) {
        BigInteger n = new BigInteger("1");
        for (int i = 0; i < 1000; i++) n = n.multiply(new BigInteger("2"));

        long ans = 0;
        String s = n.toString();

        for (int i = 0; i < s.length(); i++) {
            ans += Character.getNumericValue(s.charAt(i));
        }

        System.out.println(ans);
    }
}
