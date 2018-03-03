package packt.selenium.chap3_9.pageobjects;

/**
 * Created by Ripon on 11/19/2015.
 */
public class WrongPageException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WrongPageException(String message){
        super(message);
    }
}