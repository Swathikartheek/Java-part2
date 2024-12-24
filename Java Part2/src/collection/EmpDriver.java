package collection;

import java.util.ArrayList;

public class EmpDriver {

	public static void main(String[] args) {

		ArrayList emp=new ArrayList();
		
		emp.add(new Emp(101,"Dinga",10000.00));
		emp.add(new Emp(102,"Dingi",40000.00));
		emp.add(new Emp(103,"Manga",50000.00));
		
		System.out.println(emp);
		
		System.out.println("----------------------------");
		
		for(int i=0;i<emp.size();i++)
		{
			Emp e= (Emp) emp.get(i);
			if(e.salary>40000)
				emp.remove(i);
		}
		System.out.println(emp);
		
	}

}
