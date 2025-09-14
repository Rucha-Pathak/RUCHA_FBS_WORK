class Shape {
    // Triangle
    double area(double base, double height) {
        return 0.5 * base * height;
    }

    // Rectangle
    double area(int length, int breadth) {
        return length * breadth;
    }

    // Circle
    double area(double radius) {
        return 3.14 * radius * radius;
    }
}

class Test {
    public static void main(String[] args) {
        Shape s = new Shape();

        System.out.println("Area of Triangle: " + s.area(10.0, 5.0));
        System.out.println("Area of Rectangle: " + s.area(6, 4));
        System.out.println("Area of Circle: " + s.area(7.0));
    }
}
