/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int t = int.valueOf(args[0]);
		double totalAmountOfChildren = 0;
		int mostCommonAmountOfChildren = 0;
		int[] familySize = new int[1000000]; 
		
		for(int i = 0; i < t; i++ ){
			boolean noGirl = true;
			boolean noBoy = true;
			int amountOfChildren = 0;
			while( noBoy || noGirl ){
				amountOfChildren++;
				if(Math.random() >= 0.5){
					noGirl = false;
				}else{
					noBoy = false;
				}
			}
			totalAmountOfChildren = totalAmountOfChildren + amountOfChildren;
			familySize[amountOfChildren] = familySize[amountOfChildren] + 1;
		}
		
		for(int j = 0; j < familySize.length(); j++ ){
			if(familySize[j] > mostCommonAmountOfChildren){
				mostCommonAmountOfChildren = familySize[j];
			}
		}
		
		System.out.println("Average: " + avgAmountOfChildren + "  children to get at least one of each gender.");
		System.out.println("Number of families with 2 children " + familySize[2]);
		System.out.println("Number of families with 3 children " + familySize[3]);
		System.out.println("Number of families with 4 children " + familySize[4]);
		System.out.println("The most common number of children is " + (totalAmountOfChildren / t));
	}
}
