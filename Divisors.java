/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		//// Put your code here
		int number = Integer.valueOf(args[0]);
		for (int i = 1; i < number / 2; i++ ) {
			if(number % i == 0){
				System.out.println(i);
			}
		}
		System.out.println(number);
	}
}
