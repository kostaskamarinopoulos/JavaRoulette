import java.util.InputMismatchException;
import java.util.Scanner;


public class Game {
	
	private int game;
	
	public int game()
	{
		int p = 1;
		do
		{
			try
			{
				Scanner input = new Scanner(System.in);
				
				do
				{
					System.out.print("For playing 'Single number' game type 1. For playing 'Even or odd' game type 2. For playing American Roulette type 3. ");
					game=input.nextInt();
					
				}	while (game < 1 || game > 3);
	           p = 2;
	           
			}
			catch ( InputMismatchException e )     // Catch the errors in case the input is letter or symbol or smthg else
			{                          				
		            System.out.println("Please select an existing game");
			}
			
        }
		while( p == 1 );
		
		return game;

	}
}
