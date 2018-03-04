import java.util.Arrays;

public class HW05P02_Magic {
	
	private static void magicify4(int[][] basic) {
		int[][] forward = new int[4][4];
		int[][] backward = new int[4][4];

		for(int i=0, k=3; i<4; i++, k--) {
			for(int j=0, m=3; j<4; j++, m--) {
				forward[i][j] = basic[i][j];
				backward[i][j] = basic[k][m];
			}
		}

		for()
	}

	public static int[][] magic4() {
		int[][] forward = new int[4][4];
		int[][] backward = new int[4][4];
		int[][] magic = new int[4][4];
		int fcounter = 1;
		int bcounter = 16;

		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				forward[i][j] = fcounter;
				backward[i][j] = bcounter;

				fcounter++;
				bcounter--;
			}
		}

		
		// filling the diagonals
		for(int i=0, j=3; i<4; i++, j--) {
			System.out.println("" + i + ", " + j);
			magic[i][i] = forward[i][i];
			magic[i][j] = forward[i][j];
		}


		// filling the rest
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				magic[i][j] = magic[i][j] == 0 ? backward[i][j] : magic[i][j];
			}
		}

		return magic;
	}
	

	public static int[][] magic4N(int size) {

		int[][] magic = new int[size][size];

		int[][][] result = new int[size/4][size][size];

		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				for(int k=0; k<result[i][j].length; k++) {
					
				}
			}
		}

		return magic;
	}



	public static void main(String[] args) {
		int[][] magic = magic4();	
	//	System.out.println(Arrays.deepToString(magic));
		magic4N(12);
	}
}
