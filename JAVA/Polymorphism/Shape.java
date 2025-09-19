class Shape
{
	double area;

	Shape() {
		this.area=0.0;
	}

	Shape(double area) {
		
		this.area = area;
	}

	double getArea() {
		return area;
	}

	void setArea(double area) {
		this.area = area;
	}
	
	void display()
	{
		System.out.println("Area of shape is calculated");
	}
	double calArea()
	{
		return area;
	}
	
}//class Shape ends here

class Triangle extends Shape
{
	double height,base;

	Triangle() {
		super();
		this.height = 0.0;
		this.base=0.0;
	}

	Triangle(double area,double height, double base) {
		super(area);
		this.height = height;
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}

	double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}
	
	void display()
	{
		super.display();
		System.out.println("height is  : "+this.height);
		System.out.println("base is : "+this.base);
	}
	
	double calArea()
	{
		return 0.5*(this.height)*(this.base);
	}
	
}//class Triangle ends here

class Circle extends Shape
{
	double rad;

	Circle() {
		super();
		this.rad = 0.0;
	}

	Circle(double area,double rad) {
		super(area);
		this.rad = rad;
	}

	double getRad() {
		return rad;
	}

	void setRad(double rad) {
		this.rad = rad;
	}
	void display()
	{
		super.display();
		System.out.println("radius : "+this.rad);
	}
	double calArea()
	{
		return 3.14*(this.rad)*(this.rad);
	}
		
}//class Circle ends here

class Rectangle extends Shape
{
	double length,breadth;

	Rectangle() {
		super();
		this.length = 0.0;
		this.breadth=0.0;
	}

	Rectangle(double area,double length, double breadth) {
		super(area);
		this.length = length;
		this.breadth = breadth;
	}

	double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getBreadth() {
		return breadth;
	}

	void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	void display()
	{
		super.display();
		System.out.println("length is : "+this.length);
		System.out.println("breadth is : "+this.breadth);
	}
	double calArea()
	{
		return (this.length)*(this.breadth);
	}

}//class Rectangle ends here

class TestShape {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Shape[] s = new Shape[5];
		s[0]=new Shape(100);
		s[1] = new Triangle(500,10,5);
		s[2] = new Circle(100,5);
		s[3] = new Rectangle(100,10,30);
		
		for(int i=0;i<s.length;i++)
		{
			s[i].display();
			System.out.println("Calculated area is : "+s[i].calArea());
			System.out.println();
		}

	}

}//class TestShape ends here

