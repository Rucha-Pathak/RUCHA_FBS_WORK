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
        System.out.println("ID: " + p1.getId());
        System.out.println("Name: " + p1.getName());
        System.out.println("Quantity: " + p1.getQuantity());
        System.out.println("Price: " + p1.getPrice());
    }
}
