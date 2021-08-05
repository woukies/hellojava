public class ArrayRandomInt {
	public static void main(String[] args) {
		int[][] array = new int[3][4];
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);
				sum += array[i][j];
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("합은 " + sum);
	}
}
