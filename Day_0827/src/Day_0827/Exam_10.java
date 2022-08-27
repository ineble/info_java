package Day_0827;

/*	평균이 90이상 A 80이상 B 70이상 C 60이상 D 60미만 F
 * */
import java.util.Scanner;

public class Exam_10 {
	public static void main(String[] args) {
		int s = 0;
//		for (int i = 1; i <= 10; i+=2) {
//			s += i; //1에서 10까지 홀수의 합
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
