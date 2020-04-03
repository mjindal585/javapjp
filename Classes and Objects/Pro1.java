class Box {
	private double width;
	private double height;
	private double depth;
	
	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public double clacvol() {
		return width * height * depth;
	}
}

public class Pro1 {

	public static void main(String[] args) {
		Box box = new Box(40, 19, 58);
		System.out.println(box.clacvol());
	}

}
