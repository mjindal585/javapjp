class Patient {
	private String name;
	private double height;
	private double weight;
	
	public Patient(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public double BMI () {
		return ( weight / ( height * height ) );
	}
}

public class Pro3 {

	public static void main(String[] args) {
		Patient patient = new Patient("Mohit Jindal", 1.7, 71);
		
		System.out.println(patient.BMI());

	}

}
