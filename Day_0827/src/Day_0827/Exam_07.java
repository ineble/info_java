package Day_0827;

/*	����� 90�̻� A 80�̻� B 70�̻� C 60�̻� D 60�̸� F
 * */
import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		char ch = 'C';
		int c = 0;
		switch (ch) {
		case 'A':
			c = 1+2;
			break;
		case 'B':
			c = 2+3;
			break;
		case 'C':
			c = 3+4;
		case 'D':
			c = 4+5;
		case 'E':
			c = 5+6;
		}
		System.out.println(c);
	}
}
