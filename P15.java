import java.math.BigInteger;

public class P15 {
    //This problem is just 40 choose 20
    //or 137846528820
    public static void main(String args[]) {
        BigInteger n = new BigInteger("1");

        for (Integer i = 21; i < 41; i++) n = n.multiply(new BigInteger(i.toString()));

        for (Integer i = 1; i < 21; i++) n = n.divide(new BigInteger(i.toString()));

        System.out.println(n);
        
    }


    
}
