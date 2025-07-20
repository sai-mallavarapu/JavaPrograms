package com;

class Utils {

	public static int add(int x,int y){
		return x+y;
	}
}
	public class StaticMethodExample{
     
	public static void main(String[] args) 
	{
		int sum=Utils.add(5,10);
		System.out.println(sum);
	}
}

