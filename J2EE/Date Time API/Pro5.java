import java.time.LocalTime;


public class Pro5 {

	public static void main(String[] args) {
LocalTime t=LocalTime.now();
System.out.println("Current time: "+t);
System.out.println("Time after 25 min: "+t.plusMinutes(25));
	}
}
