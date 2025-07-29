package day8;

import java.util.HashMap;

public class HashMapProgram {
public static void main(String[] args) {
	HashMap<String,Integer> studentdata=new HashMap<String, Integer>();
	studentdata.put("sai", 23);
	studentdata.put("sam", 20);
	studentdata.put("ram", 30);
	studentdata.put("srinu", 26);
	studentdata.put("king", 29);
	studentdata.put("raju", 22);
	System.out.println(studentdata);
	
	System.out.println(studentdata.keySet());
	System.out.println(studentdata.values());
	System.out.println(studentdata.entrySet());

}
}
