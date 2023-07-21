public class ControlStatementsExample {
    public static void main(String[] args) {
        int age = 25;

        // If-else statement
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Switch statement
        int dayOfWeek = 2;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day of the week: " + dayName);
    }
}
