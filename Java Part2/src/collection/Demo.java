package collection;

import java.util.ArrayList;

public class Demo {
public static void main(String[] args) {
	ArrayList bag1= new ArrayList();
	System.out.println(bag1.size());
	bag1.add(10);
	bag1.add(20);
	bag1.add(30);
	System.out.println(bag1.size());
	System.out.println(bag1);
	
	ArrayList bag2=new ArrayList();
	System.out.println(bag2.size());
	
	bag2.add(40);
	bag2.add(50);
	System.out.println(bag2.size());
	System.out.println(bag2);
	bag1.add(2,bag2);
	System.out.println(bag1);
bag1.addAll(bag2);
System.out.println(bag1);


System.out.println("----------------------");
System.out.println(bag1.contains(10));
System.out.println(bag1.contains(bag2));
System.out.println(bag2.containsAll(bag1));
System.out.println(bag1.indexOf(bag2));
System.out.println(bag2.indexOf(1));
System.out.println("-------------------");

bag1.remove(0);
bag1.removeAll(bag2);
bag1.retainAll(bag2);
bag2.clear();



System.out.println(bag1);
System.out.println(bag2);
	
}
}
