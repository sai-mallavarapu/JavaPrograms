package day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InbuiltMethodsCollections {
public static void main(String[] args) {
	
	LinkedList<Integer> data=new LinkedList<Integer>();
	data.add(109);
	data.add(10);
	data.add(200);
	data.add(30);
	data.add(15);
	System.out.println(data);
	Collections.sort(data);
	System.out.println("after sorting:"+data);
    
   Collections.reverse(data);
   System.out.println("reversed data:"+data);
   
   Collections.swap(data, 1, 4);
   System.out.println("swapped data:"+data);
   
   Collections.emptyList();
   System.out.println(data);
   
   Collections.sort(data);
   int datasearched=Collections.binarySearch(data, 109);
   System.out.println(datasearched);
   
 
   
   Set<String> items=new HashSet<>();
   items.add("pen");
   items.add("pencil");
   items.add("eraser");
   items.add("sharpner");
   System.out.println(items);
   
   List<String> item=new ArrayList<String>(items);
   Collections.sort(item);
   System.out.println(item);
   Collections.reverse(item);
   System.out.println(item);
   
   
   Map<String, Integer> birds=new HashMap<String, Integer>();
   birds.put("peacock", 1);
   birds.put("pigeon", 2);
   birds.put("parrot", 20);
   birds.put("crow", 15);
   birds.put("sparrow", 19);
   System.out.println(birds);
   System.out.print(birds.entrySet());
   Set<String> keys = birds.keySet();
    System.out.println(keys);
    Collection<Integer> values=birds.values();
    System.out.println(values);
  
   
   
   
}
}
