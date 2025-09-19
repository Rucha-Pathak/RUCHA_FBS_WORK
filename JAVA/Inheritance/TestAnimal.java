class Animal
{
	String name;
	int age;
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	Animal() {
		this.name ="NULL";
		this.age = 0;
	}
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void display()
	{
		System.out.println("Animal name is"+this.name);
		System.out.println("Animal age is"+this.age);
	}
	
}//Class Animal ends here

class Dog extends Animal
{
	String Breed;

	String getBreed() {
		return Breed;
	}

	void setBreed(String breed) {
		Breed = breed;
	}

	Dog() {
		super();
		this.Breed="NULL";
	}

	Dog(String name, int age,String breed) {
		super(name, age);
		this.Breed=breed;
	}
	
	void display()
	{
		super.display();
		System.out.println("Dog Breed is"+this.Breed);
	}
	
}//class Dog ends here


class Cat extends Animal
{
	String Color;

	String getColor() {
		return Color;
	}

	void setColor(String color) {
		Color = color;
	}

	Cat() {
		super();
		this.Color="NULL";
	}

	Cat(String name, int age,String c) {
		super(name, age);
		this.Color=c;
	}
	
	void display()
	{
		super.display();
		System.out.println("Cat Colour is"+this.Color);
	}
	
}//class Cat ends here


public class TestAnimal {

	public static void main(String[] args) {

		Animal s1=new Animal();
		s1.display();
		
		System.out.println();
		Animal s2=new Animal("Julee",5);
		s2.display();
		
		System.out.println();
		Dog e1=new Dog();
		e1.display();
		
		System.out.println();
		Dog e2=new Dog("Bruno",6,"Labrador");
		e2.display();
		
		System.out.println();
		Cat m1=new Cat();
		m1.display();
		
		System.out.println();
		Cat m2=new Cat("Manya",2,"white-brown");
		m2.display();


	}

}
