
public class RouletteGameException extends Exception {

	private String message;
	
	public RouletteGameException( String message )
	{
		super();
		this.message = message;
		System.out.println( message );
	}

}
