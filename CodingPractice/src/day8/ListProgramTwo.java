package day8;

import java.util.ArrayList;
import java.util.List;

public class ListProgramTwo {
public static void main(String[] args) {
	
	List<String> list=new ArrayList<String>();
	list.add("sam");
	list.add("kumar");
	list.add("indra");
	list.add("abhi");
	list.remove(3);
	System.out.println(list.get(2));
	System.out.println(list);
		
}
}
