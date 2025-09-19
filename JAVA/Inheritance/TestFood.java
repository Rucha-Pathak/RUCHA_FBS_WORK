class Food 
{
    String name;
    double price;
    
    
    String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	Food() {
        this.name = "NULL";
        this.price = 0;
    }
    Food(String name, double price) {
        this.name = name;
        this.price = price;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}

class Pizza extends Food 
{
    String flavor;
    
    String getFlavor() {
		return flavor;
	}
	void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	Pizza() {
        super();
        this.flavor = "Deafult";
    }
	
    Pizza(String name, double price, String flavor) {
        super(name, price);
        this.flavor = flavor;
    }
    
    void display() {
        super.display();
        System.out.println("Flavor: " + flavor);
    }
}

class Burger extends Food 
{
    String size;
    
    
    String getSize() {
		return size;
	}
	void setSize(String size) {
		this.size = size;
	}
	Burger() {
        super();
        this.size = "Null";
    }
    Burger(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }
    void display() {
        super.display();
        System.out.println("Size: " + size);
    }
}

class Juice extends Food {
    String fruit;
    
    
    
    String getFruit() {
		return fruit;
	}
	void setFruit(String fruit) {
		this.fruit = fruit;
	}
	Juice() {
        super();
        this.fruit = "NULL";
    }
    Juice(String name, double price, String fruit) {
        super(name, price);
        this.fruit = fruit;
    }
    void display() {
        super.display();
        System.out.println("Fruit: " + fruit);
    }
}

class IceCream extends Food {
    int calories;
    
    
    
    int getCalories() {
		return calories;
	}
	void setCalories(int calories) {
		this.calories = calories;
	}
	IceCream() {
        super();
        this.calories = 450;
    }
    IceCream(String name, double price, int calories) {
        super(name, price);
        this.calories = calories;
    }
    void display() {
        super.display();
        System.out.println("Calories: " + calories);
    }
}

class TestFood {
    public static void main(String[] args) {
        Pizza p = new Pizza("Cheese Pizza", 250, "Cheese");
        p.display();
        System.out.println();
        
        Burger b = new Burger("Veg Burger", 120, "Medium");
        b.display();
        System.out.println();
        
        Juice j = new Juice("Mango Juice", 80, "Mango");
        j.display();
        System.out.println();
        
        IceCream i = new IceCream("Vanilla IceCream", 100, 250);
        i.display();
        System.out.println();

      
    }
}