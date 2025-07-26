package day5;

interface Vehicle1{
	default void display() {
		System.out.println("bike is satarted");
	}
	
}
interface Vehicle2{
	default void display() {
		System.out.println("car is started");
	}
}
interface Vehicle3{
	default void display() {
		System.out.println("bus is started");
	}
}
 class VechicleInfo implements Vehicle1,Vehicle2,Vehicle3{

	@Override
	public void display() {

		Vehicle1.super.display();
		Vehicle2.super.display();
		Vehicle3.super.display();
	}
 }

public class MultipleInterfaceBasedProgram {
public static void main(String[] args) {
	VechicleInfo v=new VechicleInfo();
	v.display();
}
}
