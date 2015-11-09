import java.util.InputMismatchException;
import java.util.Scanner;


public class ChoosePocket {
	
	private Scanner input = new Scanner(System.in);	

	public ChoosePocket() 
	{
		super();
		this.input = input;
	}
	
	public int choosepocket() throws RouletteGameException
	{
		    int choice = -1;
		    System.out.println("Please select a pocket." );
			try
			{			
				choice = input.nextInt();	
				if (  choice < 0 || choice > 36  || choice == 00 )
					
				{
					throw new RouletteGameException( "Invalid value was entered." );
				}
	               
			}catch ( InputMismatchException e)               // Catch the errors in case the input is letter or symbol or smthg else		
			{                         		
				System.out.println( "Please give a numeric value" );
				ChoosePocket pocket = new ChoosePocket(); 
                choice=pocket.choosepocket();
			}
			
		return choice;
	}
	
	public int choosepocketAmerican() throws RouletteGameException
	{
		    int choice = -1;
		    System.out.println("Please select a pocket." );
			try
			{			
				choice = input.nextInt();	
				if (  choice < -1 || choice > 36  )
					
				{
					throw new RouletteGameException( "Invalid value was entered." );
				}
	               
			}catch ( InputMismatchException e)               // Catch the errors in case the input is letter or symbol or smthg else		
			{                         		
				System.out.println( "Please give a numeric value" );
				ChoosePocket pocket = new ChoosePocket(); 
				choice=pocket.choosepocket();
			}
			
		return choice;
	}
}
