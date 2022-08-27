package Day_0827;

/*	평균이 90이상 A 80이상 B 70이상 C 60이상 D 60미만 F
 * */
import java.util.Scanner;

public class Exam_13 {
	public static void main(String[] args) {
		int dec = 7;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------1----------");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------3----------");
		int cnt=0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				cnt++;
				System.out.print(cnt + "\t");
			}
			System.out.println();
		}
		
		System.out.println("-----------4----------");
		int cnt2=0;
		for (int i = 1; i <= 5; i++) {
			int sum=0;
			for (int j = 1; j <= 5; j++) {
				cnt2++;
				sum+=cnt2;
				System.out.print(cnt2 + "\t");
			}
			System.out.print(sum + "\n");
		}
		System.out.println("-----------5----------");
		int cnt3=0;
		int sum=0;
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5; j++) {
				cnt3++;
				sum+=cnt3;
				System.out.print(cnt3 + "\t");
			}
			System.out.print(sum + "\n");
		}

	}
}
