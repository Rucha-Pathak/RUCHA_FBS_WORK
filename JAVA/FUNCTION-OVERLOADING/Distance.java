import java.util.Scanner;

class Distance {
    int feet, inches;

    void setFeet(int f) {
        this.feet = f;
    }

    void setInches(int i) {
        this.inches = i;
    }

    int getFeet() {
        return this.feet;
    }

    int getInches() {
        return this.inches;
    }

    void display() {
        System.out.println(this.feet + " feet " + this.inches + " inches");
    }
}//class Distance ends here 


class Test {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.setFeet(5);
        d1.setInches(8);
        d1.display();
        System.out.println("Feet: " + d1.getFeet());
        System.out.println("Inches: " + d1.getInches());

        Scanner sc = new Scanner(System.in);
	Distance d2 = new Distance();
	System.out.println("enter feet: ");
 	
        
    }
}
