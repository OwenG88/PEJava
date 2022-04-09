import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class P13 {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        BigInteger i = new BigInteger("0");

        try (BufferedReader br = new BufferedReader(new FileReader("P13.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
               BigInteger j = new BigInteger(line);
               i = i.add(j);
            }
        }
        
        System.out.println(i);

    }
}

