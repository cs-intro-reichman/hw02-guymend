/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//// Put your code here
		String word = "hello";
		for(int i = 0; i < word.length(); i++){
			if( (i + 1) == word.length() ){
				System.out.println(word.charAt(word.length() - 1 - i));
			}else{
				System.out.print(word.charAt(word.length() - 1 - i));
			}
		}
		System.out.println("The middle character is " + word.charAt(word.length()/2));
	}
}
