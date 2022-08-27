package Day_0827;

/*	평균이 90이상 A 80이상 B 70이상 C 60이상 D 60미만 F
 * */
import java.util.Scanner;

public class Exam_09 {
	public static void main(String[] args) {
		int s = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			s += i;
		}

		System.out.println(s);
	}
}
