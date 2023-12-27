/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int number = Integer.valueOf(args[0]);
		int perfectNumber = 0;
		for (int i = 1; i < (number / 2) + 1; i++ ) {
			if(number % i == 0){
				perfectNumber = perfectNumber + i;
			}
		}
		if(perfectNumber == number){
			System.out.println(number + " is a perfect number");
		}else{
			System.out.println(number + " is not a perfect number");
		}
	}
}
