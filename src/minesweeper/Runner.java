//Comment some wherem

package minesweeper;

public class Runner {

	public static void main(String[] args) {
		int mineX;
		int mineY;
		try {
			mineX = Integer.parseInt(args[0]);
			mineY = Integer.parseInt(args[1]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Incorrect Parameters! X and Y parameters needed! defaulting . . . ");
			mineX = 50;
			mineY = 25;
		}
		Screen scr = new Screen(mineX, mineY);

//		Thread t1 = new Thread(scr);
//		t1.start();
		
	
	}
	
}
