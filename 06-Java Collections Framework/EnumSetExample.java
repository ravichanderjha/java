import java.util.EnumSet;
import java.util.Set;

enum Days { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

public class EnumSetExample {
    public static void main(String[] args) {
        Set<Days> weekendDays = EnumSet.of(Days.SATURDAY, Days.SUNDAY);

        System.out.println("Weekend Days: " + weekendDays);
    }
}