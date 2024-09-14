import java.util.Scanner;

public class EpochTimeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter epoch time in seconds: ");
        long epochTimeSeconds = scanner.nextLong();

        String formattedDate = convertEpochToReadable(epochTimeSeconds);
        System.out.println("Formatted Date: " + formattedDate);

        scanner.close();
    }

    public static String convertEpochToReadable(long epochTimeSeconds) {
        long secondsInMinute = 60;
        long minutesInHour = 60;
        long hoursInDay = 24;
        long daysFromEpochStart = 4;

        long totalDays = epochTimeSeconds / (secondsInMinute * minutesInHour * hoursInDay);
        long dayOfWeek = (totalDays + daysFromEpochStart) % 7;

        long remainingSeconds = epochTimeSeconds % (secondsInMinute * minutesInHour * hoursInDay);

        long hours = remainingSeconds / (secondsInMinute * minutesInHour);
        remainingSeconds %= (secondsInMinute * minutesInHour);
        long minutes = remainingSeconds / secondsInMinute;
        long seconds = remainingSeconds % secondsInMinute;

        String[] daysOfWeek = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        String dayOfWeekString = daysOfWeek[(int) dayOfWeek];

        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

        return String.format("%02d-%s-%04d %s %02d:%02d:%02d",
                1 + (int) totalDays % 31,
                months[(int) totalDays % 12],
                1970 + (int) totalDays / 365,
                dayOfWeekString,
                hours, minutes, seconds);
    }
}
