package ProgramsDayThree;

class Shape{                  //RuntimePolymorphism
	public void draw() {
		System.out.println("drawing a shape");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("circle is drawing");
	}
}
class Rectange extends Shape {
	@Override
	public void draw() {
		System.out.println("rectangle is drawing");
	}
}

public class PolymorphismProgram {
	public static void main(String[] args) {
		
	Shape s=new Circle();
	Shape s1=new Rectange();
	s.draw();
	s1.draw();
	
	}
}


