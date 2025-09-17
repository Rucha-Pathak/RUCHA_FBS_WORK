import java.util.Scanner;
class Player
{
     String Name;
     int noofmatches;
     int runscored;
     int Wicketstaken;

	
    Scanner sc = new Scanner(System.in);
    
	void acceptInfo()
  	{
	   System.out.println("enter the name: ");
	   String Name = sc.nextLine();
    	   System.out,println("enter the noofmatches: ");
	    int noofmatches = sc.nextInt();
   	   System.out,println("enter the runscored: ");
	    int runsscored = sc.nextInt();
	   System.out,println("enter the wickets taken: ");
	    int Wicketstaken = sc.nextInt();
 	    sc.nextLine();
         }

	 void  diplayInfo()
        {

	System.out.println("Name : "+Name);
	System.out.println("No of matched : "+noofmatches);
	System.out.println("Run scored : "+runscored);
	System.out.println("No of wickets : "+Wicketstaken);
	
	}
}//class Player ends here

class Test
{
  public static void main(String[] args)
   {
 	Scanner sc = new Scanner(System.in);
        Player[] players = new Player[10];

	for(int i=0;i<players.length;i++)
	{
	    System.out.println("enter details of player"+(i+1));
	    

	

   }//main method ends here 

}//class Test ends here
 	