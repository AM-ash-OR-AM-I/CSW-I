import java.time.LocalDate;
import java.time.Period;

public class DateTime {
  public static void main(String[] args) {
    LocalDate birthDate = LocalDate.of(2003, 9, 29);
    LocalDate currDate = LocalDate.now();
    Period period = Period.between(birthDate, currDate);
    System.out.printf("No. of days lived till now: %s%n",
        (period.getYears() * 365 + period.getMonths() * 12 + period.getDays()));

  }
}
