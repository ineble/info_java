package Day_0827;
/*	����� 90�̻� A 80�̻� B 70�̻� C 60�̻� D 60�̸� F
 * */
import java.util.Scanner;

public class Exam_06 {
	public static void main(String[] args) {
		int kor=87, eng=88,mat=95;
		int sum = (kor+eng+mat);
		int avg = sum/3;
		String str = "";
		switch (avg/10) {
		case 10:
		case 9:	
			str = "A";
			break;
		case 8:	
			str = "B";
			break;
		case 7:	
			str = "C";
			break;
		case 6:	
			str = "D";
			break;
		default:
			str = "F";
			break;
		}
		System.out.println("������ " + str + "�Դϴ�.");
		System.out.println("����� " + avg + "�Դϴ�.");
	}
}

