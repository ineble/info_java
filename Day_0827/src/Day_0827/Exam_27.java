package Day_0827;
/*
 * 1	2	3	4  10
 * 5	6	7	8  26
 * 9   10  11  12  42
 * 13  14  15  16  58
 * 17  18  19  20  74
 * 21  22  23  24  90
 * */

public class Exam_27 {
	public static void main(String[] args) {
		int[][]a = new int[5][5];
		
		int cnt=0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				cnt = cnt + 1;
				a[i][j] = cnt;
				a[i][4] = a[i][4] + cnt;//가로합
				a[4][j] = a[4][j] + cnt;//세로합
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				//System.out.print("a["+ i+"]["+j+"] : " + a[i][j]);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
