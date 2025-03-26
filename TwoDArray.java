package Sample;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[][] = { { 12, 33, 44 }, { 99, 34, 21 }, { 99, 32, 11 } };

		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				System.out.print(data[x][y] + "  ");
			}
			System.out.println();
		}
	}

}
