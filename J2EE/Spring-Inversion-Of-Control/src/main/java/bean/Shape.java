package bean;

abstract class Shape {
	abstract void draw();
}
class Rectangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");
	}
	
}

class Triangle extends Shape{
	void draw() {
		System.out.println("Triangle");
	}
}

class Parallelogram extends Shape{
	void draw() {
		System.out.println("Paralellogram");
	}
	
}
