package ProgramsDayFour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.jar.Attributes.Name;

public class SortingNamesInArray {
public static void main(String[] args) {
	
	String[] names= {"sai","kiran","ramu","subash"};
	List<String> list= new ArrayList<String>(Arrays.asList(names));
	
	Collections.sort(list);
	System.out.println(list);
}
}
