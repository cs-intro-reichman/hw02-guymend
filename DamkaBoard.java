/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		//// Put your code here
		int n = Integer.parseInt(args[0]);
        int j = 0;
        int i = 0;
        while ( i < n ) {
            while ( j < n ) {
                j++;
				if (i%2 != 0) {
					if (j == n) {
						System.out.println(" *");
					}else{
						System.out.print(" *");
					}
           		}else{
					if (j == n) {
						System.out.println("* ");
					}else{
						System.out.print("* ");
					}
				}
			}
            i++;
            j = 0;
        }
	}
}
