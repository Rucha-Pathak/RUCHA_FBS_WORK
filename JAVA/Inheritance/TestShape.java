class Shape {
    String color;

    
    
    Shape() {
        this.color = "NULL";
    }
    Shape(String color) {
        this.color = color;
    }
   String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	
    void display() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;
    
    
    
   double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius = radius;
	}
	Circle() {
        super();
        this.radius = 0;
    }
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    void display() {
        super.display();
        System.out.println("Radius: " + radius);
    }
}

class Rectangle extends Shape 
{
    double length, width;
    
    
    double getLength() {
		return length;
	}

	void setLength(double length) {
		this.length = length;
	}

	double getWidth() {
		return width;
	}

	void setWidth(double width) {
		this.width = width;
	}

	Rectangle() {
        super();
        this.length = 0;
        this.width =0 ;
    }
    
    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    void display() {
        super.display();
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

class Triangle extends Shape {
    double base, height;
   
    
    double getBase() {
		return base;
	}

	void setBase(double base) {
		this.base = base;
	}

	double getHeight() {
		return height;
	}

	void setHeight(double height) {
		this.height = height;
	}
	 Triangle() {
	        super();
	        this.base = 0;
	        this.height = 0;
	    }
	    

	Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    void display() {
        super.display();
        System.out.println("Base: " + base + ", Height: " + height);
    }
}

class TestShape {
    public static void main(String[] args) 
    {
    	
    	Circle c1 = new Circle();
        c1.display();
        System.out.println();
        
        
        Rectangle r1 = new Rectangle();
        r1.display();
        System.out.println();
        
        Triangle t1 = new Triangle();
        t1.display();
        System.out.println();

        
        Circle c = new Circle("Red", 5.5);
        c.display();
        System.out.println();
        
        
        Rectangle r = new Rectangle("Blue", 4.0, 6.0);
        r.display();
        System.out.println();
        
        Triangle t = new Triangle("Green", 3.0, 7.0);
        t.display();
        System.out.println();
        
    }
}