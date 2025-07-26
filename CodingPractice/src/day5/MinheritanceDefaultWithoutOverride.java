package day5;

interface Tiger {
	default void eat() {
		System.out.println("eats flesh");
	}
}

interface Lion {
	default void flesheat() {
		System.out.println("eats heavy flesh");
	}
}

interface Deer {
	default void grasseat() {
		System.out.println("eats grass");
	}
}

class Animal implements Tiger, Lion, Deer {

}

public class MinheritanceDefaultWithoutOverride {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		a.flesheat();
		a.grasseat();
	}
}
