package week1.day1;

/*
 * Classroom Assignment 5: Print if the given number is odd or even
Goal: To understand the mod operator, conditional statement and logic writing
a) Create a class by name: OddOrEven
b) Create a main method using shortcut
c) Declare a class variable of type of int with a value as input
d) Write a logic to print if the given input is odd or even
Hint: Divide the given input by 2 and if the remainder is 0 -> even else odd. 
Use mod (%) operator to find remainder
 */
public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int input =5;
      if(input %2 ==0)
    	  System.out.println("The no is even");
      else
    	  System.out.println("The no is odd");
	}

}
