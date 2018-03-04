import java.util.Arrays;

public class HW05P01_Saddle {
	
	private static int maxMinVal(int[] a1D, String cond) {
		int[] sorted = new int[a1D.length];

		for(int i=0; i<sorted.length; i++)
			sorted[i] = a1D[i];
		
		Arrays.sort(sorted);

		if(cond == "max") return sorted[a1D.length - 1];
		if(cond == "min") return sorted[0];
		
		return 0;
	}
	
	private static int[] columnToRow(int[][] a2D, int colIndex) {
		int[] result = new int[a2D.length];
	
		for(int i=0; i<a2D.length; i++) {
			result[i] = a2D[i][colIndex];
		}
		return result;
	}

	public static int saddle(int[][] a2D) {
		for(int i=0; i<a2D.length; i++) {
			for(int j=0; j<a2D[0].length; j++) {
				if(a2D[i][j] == maxMinVal(a2D[i], "min")
				&& a2D[i][j] == maxMinVal(columnToRow(a2D, j), "max")) {
					return a2D[i][j];
				}
			}
		}
		
		return a2D[0][0];
	}


	public static void main(String[] args) {
		int[][] a2D = new int[][] {
			new int[] {3,2,4,3},
			new int[] {0,0,5,4},
			new int[] {1,1,1,1}
		};

		System.out.println(saddle(a2D));
	}
}
