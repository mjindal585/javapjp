import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;


public class Pro2 {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		LocalDate ss=d.plusMonths(1).with(TemporalAdjusters.dayOfWeekInMonth(2,DayOfWeek.SUNDAY));
		System.out.println("Second sunday of next month is on:"+ss);
	}

}