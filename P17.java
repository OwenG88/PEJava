public class P17 {
    
    public static void main(String args[]) {
        String units = "onetwothreefourfivesixseveneightnine";
        int unitCount = units.length();

        String teens = "teneleventwelvethirteenfourteenfifteensixteenseventeeneighteennineteen";
        int teenCount = teens.length(); 

        String tens = "twentythirtyfortyfiftysixtyseventyeightyninety";
        int tenCount = tens.length();

        //Each tens appears ten times 
        //The units all appear 9 times
        //The teens appear one
        int perHundred = tenCount*10 + unitCount*9 + teenCount; 

        //We have the original hundered
        //Then any other hundered will be prefixed with 
        // each unti appears at the start 100 times
        //then one hundered and appears 900 times
        // then we have 1-99 ten times
        // -27 to account for the times when there is no and i.e just one hundred
        //add 11 for one thousand
        int perThousand = 100*unitCount + 10*900 + 10*perHundred - 27 + 11;

        System.out.println(perThousand);

    }
}
