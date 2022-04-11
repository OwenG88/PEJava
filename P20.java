import java.math.BigInteger;

public class P20 {

    public static void main(String args[]) {
        BigInteger n = new BigInteger("1");
        for (Integer i = 1; i <= 100; i++) n = n.multiply(new BigInteger(Integer.toString(i)));


        long ans = 0;
        String s = n.toString();

        for (int i = 0; i < s.length(); i++) {
            ans += Character.getNumericValue(s.charAt(i));
        }

        System.out.println(ans);

    }
    
}
