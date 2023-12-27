/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		boolean noGirl = true;
		boolean noBoy = true;
		int amountOfChildren = 0;
		while( noBoy || noGirl ){
			amountOfChildren++;
			if(Math.random() > 0.5){
				if(!noBoy){
					System.out.println("g");
				}else{
					System.out.print("g ");
				}
				noGirl = false;
			}else{
				if(!noGirl){
					System.out.println("b");
				}else{
					System.out.print("b ");
				}
				noBoy = false;
			}
		}

		System.out.println("You made it... and you now have " + amountOfChildren + " children");
	}
}
