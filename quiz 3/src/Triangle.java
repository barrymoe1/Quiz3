
public class Triangle extends GeometricObject {
//Three Double data fields to denote three sides of a triangle
	private double side1= 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
// No arg constructor that creates a default triangle 
	public Triangle() {
		}
// A constructor that creates a triangle with the specifieed side1, side2, and side 3
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
//Accessor methods for all three data fields
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
// A method getPerimeter() that returns the perimeter of the triangle
	public double getPerimeter() {
		return (side1 +side2 + side3);
	}

// A method getArea() that returns the area of the triangle
	public double getArea() {
		double p = ((side1+side2+side3)/2);
			    return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
	}
	
// A method named toString that returns a string description of the triangle
	public String toString() {
		return "Your triangle's side 1 is: " +side1 + "side 2 is: " + side2 + "side 3 is: " + side3;
	
	}
}

