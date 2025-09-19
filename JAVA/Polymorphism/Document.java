class Document
{
	String title;
	double sizeKb;
	
	Document() {
		this.title = "not available";
		this.sizeKb = 0.0;
	}

	Document(String title, double sizeKb) {
	
		this.title = title;
		this.sizeKb = sizeKb;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	double getSizeKb() {
		return sizeKb;
	}

	void setSizeKb(double sizeKb) {
		this.sizeKb = sizeKb;
	}
	void display()
	{
		System.out.println("title : "+this.title);
		System.out.println("size in kb : "+this.sizeKb);
	}
	double calSize()
	{
		return this.sizeKb;
	}
	
}//class Document ends here



class TextDocument extends Document
{
	int wordCount;

	TextDocument() {
		super();
		this.wordCount = 0;
	}

	TextDocument(String title, double sizeKb,int wordCount) {
		super(title,sizeKb);
		this.wordCount = wordCount;
	}

	int getWordCount() {
		return wordCount;
	}

	void setWordCount(int wordCount) {
		this.wordCount = wordCount;
	}
	
	void display()
	{
		super.display();
		System.out.println("word count : "+this.wordCount);
	}
	double calSize()
	{
		return (this.wordCount)*(this.sizeKb);
	}
	
	
	
}//class TextDocument ends here

class Presentation extends Document
{
	int noofslides;

	Presentation() {
		super();
		this.noofslides=0;
	}

	Presentation(String title, double sizeKb,int noofslides) {
		super(title,sizeKb);
		this.noofslides = noofslides;
	}

	int getNoofslides() {
		return noofslides;
	}

	void setNoofslides(int noofslides) {
		this.noofslides = noofslides;
	}
	
	void display()
	{
		super.display();
		System.out.println("no of slides : "+this.noofslides);
	}
	
	double calSize()
	{
		return (this.noofslides)*(this.sizeKb);
	}
	
	
}//class Presentation ends here



class TestDocument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Document[] d = new Document[5];
		d[0] = new Document("PDf",5);
		d[1] = new TextDocument("Word",10,20);
		d[2] = new Presentation("PPt",50,10);
		
		for(int i=0;i<d.length;i++)
		{
			d[i].display();
			System.out.println("calculated size : "+d[i].calSize());
			System.out.println();
		}
				

	}

}
