package Day_0827;
/*	����� 90�̻� A 80�̻� B 70�̻� C 60�̻� D 60�̸� F
 * */
import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		int kor=87, eng=88,mat=95;
		int sum = (kor+eng+mat);
		int avg = sum/3;
		String str = "";
		if (avg>=90) {
			str="A";
		}else if (avg>=80) {
			str="B";
		}else if (avg>=70) {
			str="C";
		}else if (avg>=60) {
			str="D";
		}else {
			str="F";
		}    
		System.out.println("������ " + str + "�Դϴ�.");
		System.out.println("����� " + avg + "�Դϴ�.");
	}
}

