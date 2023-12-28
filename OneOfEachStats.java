import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed); 
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.

		//My code
		double totalAmountOfChildren = 0;
		int amountOfFamilies = 0;
		int mostCommonAmountOfChildren = 0;
		int[] familySize = new int[5]; 
		for(int i = 0; i < T; i++ ){
			boolean noGirl = true;
			boolean noBoy = true;
			int amountOfChildren = 0;
			while( noBoy || noGirl ){
				double randomNumber = generator.nextDouble();
				amountOfChildren++;
				if(randomNumber >= 0.5){
					noGirl = false;
				}else{
					noBoy = false;
				}
			}
			totalAmountOfChildren = totalAmountOfChildren + amountOfChildren;
			if(amountOfChildren > 4){
				familySize[4] = familySize[4] + 1;
			}else{
				familySize[amountOfChildren] = familySize[amountOfChildren] + 1;
			}
		}
		
		for(int j = 0; j < familySize.length; j++ ){
			if(familySize[j] > amountOfFamilies){
				amountOfFamilies = familySize[j];
				mostCommonAmountOfChildren = j;
			}
		}
		
		System.out.println("Average: " + ( totalAmountOfChildren / T ) + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children " + familySize[2]);
		System.out.println("Number of families with 3 children " + familySize[3]);
		System.out.println("Number of families with 4 children " + familySize[4]);
		System.out.println("The most common number of children is " + mostCommonAmountOfChildren);
		    
	}
}
