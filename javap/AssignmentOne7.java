import java.util.Scanner;


public class AssignmentOne7 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		System.out.println("Please enter two interger numbers one at a time: ");
		Scanner keyboard = new Scanner(System.in);
		
		num1 = keyboard.nextInt();
		num2 = keyboard.nextInt();
		
		if(num1 > num2)
			do
			{
				System.out.println(num2);
				num2++;
			}
			while(num2 != num1 + 1);
		else
			do
			{
				System.out.println(num1);
				num1++;
			}
			while(num1 != num2 + 1);
		

	}

}
