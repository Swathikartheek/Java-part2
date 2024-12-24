package inheritance;

public class Marker1 {

	public static void main(String[] args) {
		Marker m1=  new Marker(10, 10.00, "camlin", "black");
		Marker m2 = new Marker(20, 20.00, "link","blue");
		Marker m3=  new Marker(10, 10.00, "camlin", "black");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m1==m2);
		System.out.println(m1==m3);
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		

	}

}
