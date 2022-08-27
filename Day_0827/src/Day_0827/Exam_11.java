package Day_0827;

/*	평균이 90이상 A 80이상 B 70이상 C 60이상 D 60미만 F
 * */
import java.util.Scanner;

public class Exam_11 {
	public static void main(String[] args) {
		int dec=7;
		for(int i =2; i<=7; i++) {
			if(dec % i == 0) {
				if(dec==i) {
					System.out.println("소수");
					break;
				}else {
					System.out.println("소수아님");
					break;
				}
			}
			
		}
	}
}
