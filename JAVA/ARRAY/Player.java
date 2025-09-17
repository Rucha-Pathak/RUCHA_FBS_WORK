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
	   Name = sc.nextLine();
    	   System.out.println("enter the noofmatches: ");
	   noofmatches = sc.nextInt();
   	   System.out.println("enter the runscored: ");
	   runscored = sc.nextInt();
	   System.out.println("enter the wickets taken: ");
	   Wicketstaken = sc.nextInt();
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
        Player[] players = new Player[3];

	for(int i=0;i<players.length;i++)
	{
	    System.out.println("enter details of player"+(i+1));
	    players[i] = new Player();
            players[i].acceptInfo();    
	}
	

	System.out.println("\n=== Player Details ===");
        for (int i = 0; i < players.length; i++) {
             players[i].diplayInfo();
        }

	int maxrunscored = players[0]. runscored;
	for (int i = 0; i < players.length; i++)
	{
             if(players[i].runscored>maxrunscored)
			maxrunscored = players[i].runscored;
        }
	System.out.println("Maximum run scored : "+maxrunscored);

	int maxWicketstaken = players[0]. Wicketstaken;
	for (int i = 0; i < players.length; i++)
	{
             if(players[i].Wicketstaken>maxWicketstaken)
			maxWicketstaken = players[i].Wicketstaken;
        }
	System.out.println("Maximum Wickets taken : "+maxWicketstaken);



   }//main method ends here 

}//class Test ends here
 	