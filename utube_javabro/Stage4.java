package utube_javabro;
import java.util.Scanner;

public class Stage4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("what is your name");
		
		System.out.println("how old are you");
//		String name = scan.nextLine();
		
		int age = scan.nextInt();
		
		System.out.println("you are " + age);
		
		/*a particular situation you can face with 
		 * using other scanner method that is not nextLine
		 * 
		 * always make sure to add under a "scan.nextLine()* to any other 
		 * nextInt or nextDouble used
		 * nextLine will always read the \n attached in the command input
		 */
		
		scan.nextLine();
		System.out.println("what is your fav food");
		String food = scan.nextLine();
		System.out.println("my fav food is " + food);
	}

}
