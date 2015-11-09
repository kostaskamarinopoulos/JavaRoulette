import java.util.Random;

public class Earnings 
{
	private int earnings = 0;
	private int numberOfPockets = 36;
	private int low = 0;
	private int high = 37;
	private Random roulettepocket = new Random(); 
	private int randomLanding = roulettepocket.nextInt( high-low ) + low;     // Roulette wheel spins and ball lands randomly on a pocket
	
	public void earningMoneySingleGame( int money, int choice, int game )
	{	
		if ( game == 3 )
		{
			int low = -1;
			Random roulettepocket = new Random(); 
			int randomLanding = roulettepocket.nextInt( high-low ) + low;  
		}
		
		if ( choice == randomLanding )	
		{
		    earnings = money*numberOfPockets;
		    System.out.println( "Congratulations. You Won." );
		}
		else
		{
			earnings = 0;
			System.out.println( "You lost. You choose "+choice+" but the ball landed at:"+randomLanding+"." );	
		}
		
		System.out.print( "Your money:"+earnings );	
	}
	
	public void earningMoneyOddEven( int money, int choice )
	{	
		if ( (choice%2==0) == (randomLanding%2==0) && (choice != 0))     // checks if choice not equal to zero and both user and roulette choices are odd or even 
		
		{     
		    earnings = money*2;                           // Double money
		    System.out.println( "Congratulations. You Won." );
		}
		else
		{
			earnings = 0;
			System.out.println( "You lost." );	
		}
		
		System.out.print( "Your money:"+earnings );	
	}
}


