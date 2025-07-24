package ProgramsDayFour;

class Rent{

	double  expenses(int water,int houserent,double power) {
		System.out.println("high expenses");
		return water+houserent+power;
		
	}
	
	double expenses(int water,double power,int rent,int food) {
		System.out.println("less expenses");
		return water+power+rent+food;
	}

}


public class RentBased {
public static void main(String[] args) {
	Rent r=new Rent();
	System.out.println(r.expenses(500, 1000,10000));
	System.out.println(r.expenses(100, 200, 4000, 2000));
}
}
