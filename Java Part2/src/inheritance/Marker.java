package inheritance;

import java.util.Objects;

public class Marker {
	int id;
	double price;
	String brand;
	String color;
	
	Marker(int id, double price, String brand, String color)
	{
		this.id=id;
		this.price=price;
		this.brand=brand;
		this.color=color;
	}

	@Override
	public String toString() {
		return "Marker [id=" + id + ", price=" + price + ", brand=" + brand + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return id+(int)price+brand.hashCode()+color.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Marker m=(Marker) obj;
		return this.id==m.id&&this.price==m.price&&this.brand==m.brand&&this.color==m.color;
	}
	
	

}
