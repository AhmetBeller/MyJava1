package java1.lesson6.arrays;

public class RandomArray {		// Zweidimensionales Array

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[][] = new int[10][20];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = (int) (100 * Math.random() + 1); // Generiert eine Zufalszahl zwischen 1 und 100
			}
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}
}
