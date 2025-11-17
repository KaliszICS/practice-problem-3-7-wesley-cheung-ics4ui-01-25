public class PracticeProblem {

	public static void main(String args[]) {
	String[][] maze = {
      {"", "*", ""},
      {"S", "*", "F"},
    };
	System.out.println(searchMazeMoves(maze));
	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}
	public static int searchMazeMoves(String[][] arr) {
		int row = arr.length - 1;
		int col = 0;
		int moves = 0;
		int a = dfsHelper(arr, row, col, moves);
		if (a == 999999){
			return -1;
		}
		return a;
		
	}
	public static int dfsHelper(String[][] arr, int row, int col, int moves) {
		if (arr[row][col] == "*") {
			return 999999;
		}
		if (arr[row][col] == "F") {
			return moves;
		}
		String[][] newarr = new String[arr.length][];
		for (int i = 0;i<arr.length;i++) {
			newarr[i]=new String[arr[i].length];
			for (int j = 0;j<arr[i].length;j++) {
				newarr[i][j] = arr[i][j];
			}
		}
		newarr[row][col] = "*";
		int a;
		int b;
		int c;
		int d;
		
		if ((row-1)<0) {
			a=999999;
		} else {
			a = dfsHelper(newarr, row-1, col, moves+1);
		}
		if ((col+1)>(arr[row].length-1)) {
			b=999999;
		} else {
			b = dfsHelper(newarr, row, col+1, moves+1);
		}
		if ((row+1)>(arr.length-1)) {
			c=999999;
		} else {
			c = dfsHelper(newarr, row+1, col, moves+1);
		}
		if ((col-1)<0) {
			d=999999;
		} else {
			d = dfsHelper(newarr, row, col-1, moves+1);
		}
		return Math.min(Math.min(a,b),Math.min(c,d));
		
	}

}
