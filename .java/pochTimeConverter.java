public class EpochTimeConverter {
  public static void main(String[] args) {
      long secondsSinceEpoch = System.currentTimeMillis() / 1000; // Current time in seconds since the epoch

      // Number of seconds in a minute, hour, day
      long secondsInMinute = 60;
      long secondsInHour = 60 * secondsInMinute;
      long secondsInDay = 24 * secondsInHour;

      // Calculate the number of days, hours, minutes, and seconds
      long days = secondsSinceEpoch / secondsInDay;
      long remainingSeconds = secondsSinceEpoch % secondsInDay;
      long hours = remainingSeconds / secondsInHour;
      remainingSeconds %= secondsInHour;
      long minutes = remainingSeconds / secondsInMinute;
      long seconds = remainingSeconds % secondsInMinute;

      // Calculate the day of the week (0 = Thursday, 1 = Friday, ..., 6 = Wednesday)
      int dayOfWeek = (int) ((days + 3) % 7);

      // Map the day of the week to the corresponding day name
      String[] daysOfWeek = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
      String currentDay = daysOfWeek[dayOfWeek];

      // Print the result
      System.out.println("Current Date: " + days + " days since epoch");
      System.out.println("Current Day: " + currentDay);
      System.out.println("Time: " + String.format("%02d:%02d:%02d", hours, minutes, seconds));
  }
}
