package day8;

public class WrapperClassbased {
public static void main(String[] args) {
	float f=10.000f;
	Float i=f;
	System.out.println("autoboxing:"+i);
	
	float f1=Float.valueOf(i);
	System.out.println("unboxing:"+f1);
}
}
