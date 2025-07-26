package day5;

interface VehicleBike{
	void display();
}

	interface VehicleCar{
		void display();
	}
	interface VehicleBus{
		void display();
	}
	
	class Vehicle  implements VehicleBike,VehicleCar,VehicleBus{

		@Override
		public void display() {
			System.out.println("vechicle is started");
			
		}

	}
public class MultipleInterfaceProgram{
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.display();
	
			
		
	}
}

