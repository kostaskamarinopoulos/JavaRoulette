import java.util.InputMismatchException;
import java.util.Scanner;


public class BetMoney {
	
	private Scanner input = new Scanner(System.in);	

	public BetMoney() 
	{
		super();
		this.input = input;
	}

	public int bet() throws RouletteGameException
	{
		int money = 0;

	    System.out.println("Give amount of money to bet." );  

		try
		{
			money = input.nextInt();	

			if (  money < 1  )
			{
				throw new RouletteGameException( "Invalid value was entered." );
			}
			
		}catch ( InputMismatchException e )
		{
			System.out.println( "Please give a numeric value" );
			BetMoney userBet = new BetMoney(); 
			money=userBet.bet();
		}
			
		return money;
		
    }
}