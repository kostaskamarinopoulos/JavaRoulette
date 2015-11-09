import java.util.InputMismatchException;


public class MainRoulette {

	public static void main(String args[]) throws RouletteGameException
	{
		// Create objects
		final Game gameType = new Game();    
		final BetMoney userBet = new BetMoney();        
		final ChoosePocket pocket = new ChoosePocket();      
		final Earnings earningMoney=new Earnings();          
		
		int game = gameType.game();                       //call game method from Game class(Single number, Odd or Even, American roulette)
		
		if ( game==1 )                                   
		{                                           
			int money = userBet.bet();                    //call bet method from BetMoney class
			int choice = pocket.choosepocket();           //call choosepocket method from ChoosePocket class
					
			earningMoney.earningMoneySingleGame(money, choice, game);
		}

		else if ( game==2 )                              
		{                            
			int money=userBet.bet();                      //call bet method from BetMoney class
			int choice = pocket.choosepocket();           //call choosepocket method from ChoosePocket class
					
			earningMoney.earningMoneyOddEven(money, choice);
		}
		
		else if ( game==3 )                    
		{                            
			int money=userBet.bet();                  //call bet method from BetMoney class
			int choice = pocket.choosepocketAmerican();        //call choosepocket method from ChoosePocket class
					
			earningMoney.earningMoneySingleGame(money, choice, game);
		}

	}
}
