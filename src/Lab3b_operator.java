
import java.util.Scanner;

public class Lab3b_operator {


	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int computerNum;
		int guessNum;
		computerNum = 0 + (int) (Math.random() * 10);
		
		System.out.print( "computerNum");
		computerNum = input.nextInt();
		
		System.out.print( "Guess a number: " );
		guessNum = input.nextInt();
		
		if (computerNum > guessNum) {
			System.out.print(" max is " + computerNum);
		}
			else {
				
				System.out.print(" max is 5, " + computerNum);
			 }
		
		
		input.close();
	}
}
