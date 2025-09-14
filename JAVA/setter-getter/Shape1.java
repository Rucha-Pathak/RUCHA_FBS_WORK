class Shape
{
  
     void calculateArea(Triangle t)
  {
        double area = 0.5*t.getBase()*t.getHeight();
  	System.out.println("area of traingle is: "+area);
  
   }
      void calculateArea(Circle c)
  { 
         double area = 3.14*c.getRadius()*c.getRadius();
  	System.out.println("area of circle is: "+area);	
  
   }
     void calculateArea(Rectangle r)
  {
       double area = r.getLength()*r.getBreadth();
  	System.out.println("area of rectangle is: "+area);

  
   }
}//class Shape ends here


class Triangle{
  double base,height;

 Triangle()//constructor
{
     this.base=0;
     this.height =0;
}


  Triangle(double base, double height)//constructor
{
     this.base=base;
     this.height =height;
}

//setters 
void setBase(double b)
{
   this.base = b;
}
void setHeight(double h)
{
   this.height = h;
}

//getter
double getBase()
{
   return this.base;
}
double getHeight()
{
   return this.height;
}

void display()
{
   System.out.println("base: "+this.base);
   System.out.println("height: "+this.height);
}
}//class Triangle end here


class Circle
{
  double radius;
  Circle()
  {
    this.radius = 3;
  }
  Circle(double r)
  {
   this.radius = r;
  }
  void setRadius(double r)
  {
     this.radius = r;
  }
  double getRadius()
  {
    return this.radius;
  }
  void display()
  {
     System.out.println("radius is : "+this.radius);
  }
}//class Circle ends here 
   

class Rectangle
{
   double length,breadth;
   Rectangle()
   {
       this.length=1;
       this.breadth=1;
   }
   Rectangle(double l,double b)
   {
   	this.length = l;
	this.breadth = b;
   }
   void setLength(double l)
   {
       this.length= l;
      
   }
   void setBreadth(double b)
   {
       this.breadth= b;
      
   }

   double getLength()
  {
    return this.length;
  }
  double getBreadth()
  {
    return this.breadth;
  }

  void display()
  {
     System.out.println("length : "+this.length);
     System.out.println("breadth : "+this.breadth);
  }
}//class rectangle ends here

class Test
{
  public static void main(String[] args)
  {
        
	 
	
       Shape s1 = new Shape();
       Triangle t1= new Triangle(5,3);
	t1.display();
	s1. calculateArea(t1);

       Circle c1= new Circle(5);
	c1.display();
 	s1. calculateArea(c1);

       Rectangle r1 = new Rectangle(10,20);
	r1.display();
	s1. calculateArea(r1);
	 
  }
}
       
  

