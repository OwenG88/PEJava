import java.time.LocalDate;

public class P19 {
    public static void main(String args[]) {

        LocalDate d = LocalDate.of(1901, 1, 1);
        LocalDate ub = LocalDate.of(2000, 12, 31);
        
        int sundayCount = 0;

        while (d.compareTo(ub) < 0) {
            if (d.getDayOfWeek().toString() == "SUNDAY") {
                sundayCount++;
            }
            d = d.plusMonths(1);
        }
        System.out.println(sundayCount);

    }
}
