package Day_0827;
/*
 * 1	2	3	4	5
 * 6	7	8	9  10
 * 11  12  13  14  15
 * 16  17  18  19  20
 * 21  22  23  24  25
 * */

public class Exam_26 {
	public static void main(String[] args) {
		int[][]a = new int[5][5];
		
		int cnt=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				cnt++;
				a[i][j] = cnt;
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
