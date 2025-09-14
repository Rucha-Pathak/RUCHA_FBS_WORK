import java.util.Scanner;

class Product {
    int id;
    String name;
    int quantity;
    double price;

    void setId(int i) {
        this.id = i;
    }

    void setName(String n) {
        this.name = n;
    }

    void setQuantity(int q) {
        this.quantity = q;
    }

    void setPrice(double p) {
        this.price = p;
    }

    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    int getQuantity() {
        return this.quantity;
    }

    double getPrice() {
        return this.price;
    }

    void display() {
        System.out.println("Product ID: " + this.id + ", Name: " + this.name + 
                           ", Quantity: " + this.quantity + ", Price: " + this.price);
    }
}

class Test {
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.setId(101);
        p1.setName("Laptop");
        p1.setQuantity(5);
        p1.setPrice(55000);
        p1.display();
	
	Scanner sc = new Scanner(System.in);

	Product p2 = new Product();

	System.out.println("enter id :");
	int i = sc.nextInt();
	sc.nextLine();s

	System.out.println("enter name :");
	String n = sc.nextLine();

	System.out.println("enter quantity :");
	int q = sc.nextInt();

	System.out.println("enter price :");
	double p = sc.nextDouble();
	
	p2.setId(i);
        p2.setName(n);
        p2.setQuantity(q);
        p2.setPrice(p);
        p2.display();


    }
}
