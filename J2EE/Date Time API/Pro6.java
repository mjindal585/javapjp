
import java.time.LocalTime;

public class Pro6 {

	public static void main(String[] args) {
		LocalTime t=LocalTime.now();
		
		System.out.println("Current time: "+t);
		System.out.println("Time before 5hrs and 30 min: "+t.minusHours(5).minusMinutes(30));
	}

}