/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int number = Integer.parseInt(args[0]);
		int perfectNumber = 0;
		int[] perfectNumberArray = new int[1000000];
		int amountOfPerfect = 0;
		for (int i = 1; i < (number / 2) + 1; i++) {
			if (number % i == 0) {
				perfectNumber = perfectNumber + i;
				perfectNumberArray[amountOfPerfect] = i;
				amountOfPerfect++;
			}
		}
		if (perfectNumber == number) {
			System.out.print(number + " is a perfect number since " + number + " = " );
			for (int j = 0; j < amountOfPerfect; j++) {
				if( j == 0){
					System.out.print(perfectNumberArray[j]);
				}else{
					System.out.print(" + " + perfectNumberArray[j]);
				}
			}
		}else{
			System.out.println(number + " is not a perfect number");
		}
	}
}
