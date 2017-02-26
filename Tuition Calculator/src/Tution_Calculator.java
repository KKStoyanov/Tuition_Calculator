import java.util.Scanner;

//Name: Kalloyan Stoyanov
public class Tution_Calculator {

	public static void main(String[] args) {
		// Scanner Object.
		Scanner input = new Scanner(System.in);

		// Question and variable regarding the initial tuition cost.
		System.out.println("What is your initial tuition cost?");
		double iTCost = input.nextDouble();

		// This for loop asks the percentage increase for every year and finds
		// the value of the new tuition. The new tuition for every year is added
		// to the total tuition cost.
		double percentIncrease;
		double totalTuitionCost = 0;
		for (int i = 1; i <= 4; i++) {
			System.out.println("By how much percent does the tuition of year " + i + " increase?");
			percentIncrease = input.nextDouble();
			totalTuitionCost += ((percentIncrease / 100) * iTCost) + iTCost;
			iTCost += (percentIncrease / 100) * iTCost;
		}

		// This print statement prints what the person's total tuition is for
		// the four years with two decimal places.
		System.out.printf("Your total tuition for the four years is %.2f dollars.", totalTuitionCost);

		// This closes the Scanner Object.
		input.close();

	}

}
