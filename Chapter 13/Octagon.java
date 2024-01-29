
public class Octagon extends GeometricObject implements Cloneable,
	Comparable<Octagon>{
	
	private double side;
	
	Octagon() {
		side = 0;
	}
	
	Octagon(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}
	
	@Override
	public double getPerimeter() {
		return side * 8;
	}
	
	@Override 
	public int compareTo(Octagon o) {
		if (getArea() < o.getArea()) {
			return -1;
		}
		else if (getArea() > o.getArea()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
	@Override 
	public String toString() {
		return super.toString() + "Octagon:  Side: " + side + 
				" Perimeter: " + getPerimeter() + " Area: " + getArea();
	}
}
