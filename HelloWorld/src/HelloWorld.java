import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			


		Scanner in = new Scanner(System.in);

		HelloUser user= new HelloUser();
		
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.print("Please enter your name: ");
		user.userName=in.next();
		user.greetUser();
		
	}

}
