package Day_0827;

/*	����� 90�̻� A 80�̻� B 70�̻� C 60�̻� D 60�̸� F
 * */
import java.util.Scanner;

public class Exam_11 {
	public static void main(String[] args) {
		int dec=7;
		for(int i =2; i<=7; i++) {
			if(dec % i == 0) {
				if(dec==i) {
					System.out.println("�Ҽ�");
					break;
				}else {
					System.out.println("�Ҽ��ƴ�");
					break;
				}
			}
			
		}
	}
}
