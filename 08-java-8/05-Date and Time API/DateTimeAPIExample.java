import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Duration;
import java.time.Period;

public class DateTimeAPIExample {
    public static void main(String[] args) {
        // LocalDate example
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // LocalTime example
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // LocalDateTime example
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // ZonedDateTime example
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Current Date and Time with Time Zone: " + zonedDateTime);

        // Duration example
        LocalDateTime startDateTime = LocalDateTime.of(2023, 7, 1, 12, 0, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2023, 7, 22, 18, 30, 0);
        Duration duration = Duration.between(startDateTime, endDateTime);
        System.out.println("Duration between start and end: " + duration);

        // Period example
        LocalDate startDate = LocalDate.of(2023, 7, 1);
        LocalDate endDate = LocalDate.of(2023, 7, 22);
        Period period = Period.between(startDate, endDate);
        System.out.println("Period between start and end: " + period);
    }
}
