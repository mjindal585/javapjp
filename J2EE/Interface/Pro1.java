interface Vehicle{
	default void message() {
		System.out.println("Inside Vehicle");
	}
}
interface FourWheeler{
	default void message() {
		System.out.println("Inside FourWheeler");
	}
}
public class Pro1 implements Vehicle,FourWheeler {

	public void message() {
		System.out.println("Inside class Car");
		Vehicle.super.message();
	}
	
	public static void main(String[] args) {
		Pro1 in=new Pro1();
		in.message();

	}

}