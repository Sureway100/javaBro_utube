package utube_javabro;

public class WeekTwo {

	public static void main(String[] args) {
//	* String*********************************************************************
		
		
		
//		String txt = "Hello World";
//		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
//		System.out.println(txt.toLowerCase());
//		
//		String txt = "Please locate where 'locate' occurs!";
//		System.out.println(txt.indexOf("locate")); // Outputs 7
//		
//		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		System.out.println("The length of the txt string is: " + txt.length());
//		
//		String Concatenation--->>>>>>>>>>>>>>>>>>>
//		
//		String firstName = "John";
//		String lastName = "Doe";
//		System.out.println(firstName + " " + lastName);
//		
//		String firstName = "John ";
//		String lastName = "Doe";
//		System.out.println(firstName.concat(lastName));
		
		
		
//		Excape characters>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//		The solution to avoid this problem, is to use the backslash escape character.
//		The backslash (\) escape character turns special characters into string characters:
//
//		Escape character	Result	Description
//		\'	'	Single quote
//		\"	"	Double quote
//		\\	\	Backslash
		
		
//		Other common escape sequences that are valid in Java are:
//			Code	Result	
//			\n	New Line	
//			\r	Carriage Return	
//			\t	Tab	
//			\b	Backspace	
//			\f	Form Feed
		
		

//	✧ Java MATH**********************************************************************
		
		
		
//	Java Math>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//	Math.max(x,y)
//	The Math.max(x,y) method can be used to find the highest value of x and y
//		
//	Math.min(x,y)
//	The Math.min(x,y) method can be used to find the lowest value of x and y
//			
//	Math.sqrt(x)
//	The Math.sqrt(x) method returns the square root of x
//				
//	Math.abs(x)
//	The Math.abs(x) method returns the absolute (positive) value of x
//					
//	Random Numbers
//	Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
//	int randomNum = (int)(Math.random() * 101);  // 0 to 100
		
		
		
		
		
				
		
//	✧ Conditional Statements  ❯ if, if else, else if, switch*******************************
		
	
//		Java Conditions and If Statements
//		You already know that Java supports the usual logical conditions from mathematics:
//
//		Less than: a < b
//		Less than or equal to: a <= b
//		Greater than: a > b
//		Greater than or equal to: a >= b
//		Equal to a == b
//		Not Equal to: a != b
//		You can use these conditions to perform different actions for different decisions.
//
//		Java has the following conditional statements:
//
//		Use if to specify a block of code to be executed, if a specified condition is true
//		Use else to specify a block of code to be executed, if the same condition is false
//		Use else if to specify a new condition to test, if the first condition is false
//		Use switch to specify many alternative blocks of code to be executed
		
		
		
//		Short Hand If...Else
//		There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
//
//		It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:
//
//		SyntaxGet your own Java Server
//		variable = (condition) ? expressionTrue :  expressionFalse;
//		
//		
//		int time = 20;
//		String result = (time < 18) ? "Good day." : "Good evening.";
//		System.out.println(result);
//		
		
		
		
		
		
//		This is how it works:
//
//			The switch expression is evaluated once.
//			The value of the expression is compared with the values of each case.
//			If there is a match, the associated block of code is executed.
//			The break and default keywords are optional, and will be described later in this chapter
//			The example below uses the weekday number to calculate the weekday name:
//
//			Example
//			int day = 4;
//			switch (day) {
//			  case 1:
//			    System.out.println("Monday");
//			    break;
//			  case 2:
//			    System.out.println("Tuesday");
//			    break;
//			  case 3:
//			    System.out.println("Wednesday");
//			    break;
//			  case 4:
//			    System.out.println("Thursday");
//			    break;
//			  case 5:
//			    System.out.println("Friday");
//			    break;
//			  case 6:
//			    System.out.println("Saturday");
//			    break;
//			  case 7:
//			    System.out.println("Sunday");
//			    break;
//			}
//			// Outputs "Thursday" (day 4)
		
		
		
		
		
		
//		The break Keyword
//		When Java reaches a break keyword, it breaks out of the switch block.
//
//		This will stop the execution of more code and case testing inside the block.
//
//		When a match is found, and the job is done, it's time for a break. There is no need for more testing.
//		
//		
//		The default Keyword
//		The default keyword specifies some code to run if there is no case match:
//		
		
		
		
		
//	✧ Loops   ❯ while, for, do-while*****************************************************
		
//		Java While Loop>>>>>>>>>>>>>>>>>
//		The while loop loops through a block of code as long as a specified condition is true:
//
//		while (condition) {
//		  // code block to be executed
//		}
//		
//		
//		The Do/While Loop>>>>>>>>>>>>>>>>>
//		The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
//
//		Syntax
//		do {
//		  // code block to be executed
//		}
//		while (condition);
	
		
		
//		FOR LOOP >>>>>>>>>>>
//		for (int i = 0; i < 5; i++) {
//			  System.out.println(i);
//		}
		
		
//		
//		For-Each Loop>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//		There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
//
//		for (type variableName : arrayName) {
//		  // code block to be executed
//		}
//
//		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//		for (String i : cars) {
//		  System.out.println(i);
//		}
//		
		
//	✧ break and continue************************************************************
		
//		Java Break>>>>>>>>>>>>>>>>>>
//
//		The break statement can also be used to jump out of a loop.
//
//		This example stops the loop when i is equal to 4:
//
//		for (int i = 0; i < 10; i++) {
//		  if (i == 4) {
//		    break;
//		  }
//		  System.out.println(i);
//		}
//		 
//
//		Java Continue>>>>>>>>>>>>>>>
//		The continue statement breaks one iteration (in the loop), 
//		if a specified condition occurs, and continues with the next iteration in the loop.
//
//		This example skips the value of 4:
//
//		Example
//		for (int i = 0; i < 10; i++) {
//		  if (i == 4) {
//		    continue;
//		  }
//		  System.out.println(i);
//		}
		
//	✧ Exception Handling   ❯ try, catch, finally*************************************

	}

}
