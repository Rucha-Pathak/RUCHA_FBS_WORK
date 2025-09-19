class ElectricityBill
{
   int b_id;
   String name;
    static double ratePerUnit;
    int noofunits;

    
static{//set default value for ratePerUnit
 	 ratePerUnit=10;
 }

 
   static void setRatePerUnit(double r)
   {
   	ratePerUnit = r;
   }

   void setId(int i) {
        this.b_id = i;
    }

    void setName(String n) {
        this.name = n;
    }
	void setUnits(int u) {
        this.noofunits = u;
    }


    int getId() {
        return this.b_id;
    }
 int getUnits() {
        return this.noofunits;
    }


    String getName() {
        return this.name;
    }

   ElectricityBill()
    {
            this.b_id = 101; 
	    this.name = "john";
		this.noofunits = 10;	     
    }

   ElectricityBill(int i, String str, int u)
    {
            this.b_id = i; 
	    this.name = str;
		this.noofunits = u;	     
    }

    void display()
   {
   
       	System.out.println("id : "+ this.b_id+" name : "+this.name+" Rate-per-unit : "+ ratePerUnit+"  no of units: "+this.noofunits);

   }

    void calculateElectricityBill()
    {
      System.out.println("bill for "+ this.b_id + " is : " +(ratePerUnit*this.noofunits));
    }

}//class ElectricityBill ends here

class Test {
    public static void main(String[] args) {
        ElectricityBill e1 = new ElectricityBill(101,"rucha",40);
	ElectricityBill e2 = new ElectricityBill(102, "riya",30);
	ElectricityBill e3 = new ElectricityBill();
        
	
     	e1.display();
     	e2.display();
     	e3.display();
e1.calculateElectricityBill();
e2.calculateElectricityBill();
e3.calculateElectricityBill();

        ElectricityBill.setRatePerUnit(2.5);

    	e1.display();
	e2.display();
	e3.display();
	

}
}//class Test ends here
   