package ProgramsDayThree;


 class Vehicle {          
 public void start() {
	 System.out.println("vehicle starts");
 }
 }
 class Car extends Vehicle{      //Inheritance
	 public void move() {
		 System.out.println("vehicle is moving");
	 }
 }
 public class Vehicle2 {
	 public static void main(String[] args) {
	 	Car c=new Car();
	 	c.start();
	 	c.move();
	 	
	 }
	 
 }
