package Day_0827;

/*	����� 90�̻� A 80�̻� B 70�̻� C 60�̻� D 60�̸� F
 * */
import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		int s = 0;
//		for (int i = 1; i <= 10; i+=2) {
//			s += i; //1���� 10���� Ȧ���� ��
//		}
//		for(int i = 1; i<=10; i++) {
//			if(i%2!=0) {
//				s+=i;
//			}
//		}
//		System.out.println(s);
		for(int i = 1; i<=10; i++) {
			if(i%2==1) {
				s+=i;
			}else {
				s-=i;
			}
		}
		System.out.println(s);
	}
}
