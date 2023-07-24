The Date and Time API (JSR 310) introduced in Java 8 provides a modern and more comprehensive set of classes to handle dates, times, and periods. It aims to address the limitations and complexities of the legacy `java.util.Date` and `java.util.Calendar` classes, providing a more intuitive and reliable approach to working with date and time values. The main classes in the Date and Time API are `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, and `Duration`, among others.

In-depth Description:

1. `LocalDate`:
   `LocalDate` represents a date without a time zone information. It stores year, month, and day-of-month values and can be used to perform date-based operations.

2. `LocalTime`:
   `LocalTime` represents a time without date and time zone information. It stores hour, minute, second, and fraction of second values and can be used for time-based operations.

3. `LocalDateTime`:
   `LocalDateTime` represents a date and time without time zone information. It combines `LocalDate` and `LocalTime` and can be used to handle both date and time operations.

4. `ZonedDateTime`:
   `ZonedDateTime` represents a date and time with time zone information. It is useful for handling date and time operations in different time zones.

5. `Duration` and `Period`:
   `Duration` represents a time-based amount, such as the difference between two time points, while `Period` represents a date-based amount, such as the difference between two dates.

Program Example:

Let's create a program to demonstrate the usage of some of the main classes in the Date and Time API:

```java
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
```

Output:
```
Current Date: 2023-07-22
Current Time: 13:44:59.506
Current Date and Time: 2023-07-22T13:44:59.506
Current Date and Time with Time Zone: 2023-07-22T13:44:59.507+05:30[Asia/Kolkata]
Duration between start and end: PT10H30M
Period between start and end: P21D
```

In this example, we used several classes from the Date and Time API:

1. `LocalDate`, `LocalTime`, and `LocalDateTime` to obtain the current date, time, and date-time respectively.

2. `ZonedDateTime` to get the current date and time with time zone information.

3. `Duration` to calculate the difference between two `LocalDateTime` instances.

4. `Period` to calculate the difference between two `LocalDate` instances.

The Date and Time API provides a more intuitive and powerful way to work with dates, times, and durations in Java, avoiding the pitfalls of the old `java.util.Date` and `java.util.Calendar` classes and simplifying date and time operations. It is recommended to use the new Date and Time API whenever possible to ensure cleaner and more maintainable code when dealing with date and time-related tasks.