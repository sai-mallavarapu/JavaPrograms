package day5;

interface A {
	static void bike() {
		System.out.println("bike is moving");
	}
}

interface B {
	static void car() {
		System.out.println("car is moving");
	}
}

interface C {
	static void bus() {
		System.out.println("Bus is moving");
	}
}
class Test implements A,B,C{
	//not ovveriden static methods
}

public class MultipleInterfaceUsingStaticMethods {
public static void main(String[] args) {
	A.bike();
	B.car();
	C.bus();
}
}
