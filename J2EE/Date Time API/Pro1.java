import java.time.*;


public class Pro1 {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		System.out.println("Today's date:"+d);
		System.out.println("Date after 10 day's:"+d.plusDays(10));

	}

}