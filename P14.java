import java.util.HashMap;

public class P14 {

    static HashMap<Long, Integer> collatzLookup = new HashMap<>();

    public static int collatz(Long value) {
        //Take in a value and return the length of the collatz
        //sequence associated with it

        int sequenceLength = 0;

        while (value > 1) {

            if (value % 2 == 0) {
                value = value / 2;
            } else {
                value = 3*value + 1;
            }

            sequenceLength++;


            //See if we have already calculated this value
            if (collatzLookup.containsKey(value)) {
                return (sequenceLength + collatzLookup.get(value));
            }

   
        }
        return sequenceLength;
        
    }

    public static void main(String args[]) {

        int maxLength = 0;
        Long maxValue = 0L;

        for (Long i = 1L; i < 1000000; i++) {

            int sequenceLength = collatz(i);

            collatzLookup.put(i, sequenceLength);

            //Check if new maxima 
            if (sequenceLength > maxLength) {
                maxLength = sequenceLength;
                maxValue = i;
            }

        }

        System.out.println(maxValue);
    }
}
