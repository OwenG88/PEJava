public class P5 {
    public static void main(String args[]) {
        //This is extemely inefficient but takes <1 second to run 
        //Ideall
        int bound  = 1000000000;
        for (int i = 1; i < bound; i++) {
            boolean flag = true;

            for (int j = 2; j <= 20; j++) {
                if (i % j != 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(i);
                return;
            }
        }
    }  
}
