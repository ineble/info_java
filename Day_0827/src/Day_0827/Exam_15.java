package Day_0827;

/*	평균이 90이상 A 80이상 B 70이상 C 60이상 D 60미만 F
 * */

public class Exam_15 {
	public static void main(String[] args) {
		// for()
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.println("for() sum= " + sum);
		// while()
		int j = 0;
		int tot = 0;

		while (j < 10) {
			j = j + 1;
			tot = tot + j;
		}
		System.out.println("while() tot = " + tot);

		// while2()
		int j2 = 1;
		int tot2 = 0;
		while (j2 <= 10) {
			tot2 += j2;
			j2++;
		}
		System.out.println("while2() tot2 = " + tot2);
		
		// while3()
		int j3 = 1;
		int tot3 = 1;
		while (j3 < 10) {
			j3++;
			tot3 += j3;
		}
		System.out.println("while3() tot3 = " + tot3);

	}
}
