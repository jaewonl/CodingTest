package code;

public class Q05 {

	public static void main(String[] args) {
      int[][] arr = { 
               {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
               {0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
               {0, 0, 0, 1, 1, 1, 0, 0, 0, 0}, 
               {0, 1, 1, 1, 1, 1, 1, 0, 0, 0}, 
               {0, 1, 1, 1, 1, 1, 1, 1, 1, 0}, 
               {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
               {0, 0, 1, 1, 1, 1, 1, 1, 0, 0}, 
               {0, 0, 0, 1, 1, 1, 1, 0, 0, 0}, 
               {0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
               {0, 0, 0, 0, 0, 0, 0, 0, 0, 0} 
               };
		int max_length = Math.round(arr.length / 2);
		for (int k = 0; k < max_length; k++) {
			for (int i = 0; i <= arr.length - 1; i++) {
				for (int j = 0; j <= arr[i].length - 1; j++) {
					if ((i > 0 && i < arr.length - 1) && (j > 0 && j < arr[i].length - 1)) {
						if ((arr[i][j - 1] > k) && (arr[i][j + 1] > k) && (arr[i + 1][j] > k) && (arr[i - 1][j] > k)) {
							arr[i][j] += 1;
						}
					}
				}
			}
		}

		int temp = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr.length - 1; j++) {
				temp += arr[i][j];
				System.out.print(arr[i][j]);
				if (j == arr.length -1) {
					System.out.println();
				}
			}
 		}
		System.out.println(temp);
	}
}