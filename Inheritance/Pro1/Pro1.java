class Animal {
	
	public void eat () {
		System.out.println("Animal class eat()");
	}
	
	public void sleep () {
		System.out.println("Animal class sleep()");
	}
}
class Bird extends Animal {
	@Override
	public void eat () {
		System.out.println("Bird class eat()");
	}
	
	@Override
	public void sleep () {
		System.out.println("Bird class sleep()");
	}
	
	public void fly () {
		System.out.println("Bird class fly()");
	}
}

public class Pro1 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();

		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}

}
