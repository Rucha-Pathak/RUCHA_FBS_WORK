class Book {
    String isbn;
    String title;
    String author;
    String publisher;
    double price;

    void setIsbn(String i) {
        this.isbn = i;
    }

    void setTitle(String t) {
        this.title = t;
    }

    void setAuthor(String a) {
        this.author = a;
    }

    void setPublisher(String p) {
        this.publisher = p;
    }

    void setPrice(double pr) {
        this.price = pr;
    }

    String getIsbn() {
        return this.isbn;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    String getPublisher() {
        return this.publisher;
    }

    double getPrice() {
        return this.price;
    }

    void display() {
        System.out.println("ISBN: " + this.isbn + ", Title: " + this.title +
                           ", Author: " + this.author + ", Publisher: " + this.publisher +
                           ", Price: " + this.price);
    }
}

class Test {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setIsbn("978-81-7992-377-7");
        b1.setTitle("Java Programming");
        b1.setAuthor("James Gosling");
        b1.setPublisher("Pearson");
        b1.setPrice(750);
        b1.display();
        System.out.println("ISBN: " + b1.getIsbn());
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Publisher: " + b1.getPublisher());
        System.out.println("Price: " + b1.getPrice());
    }
}
