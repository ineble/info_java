package Day_0827;

import java.util.Scanner;

/*	����� 90�̻� A 80�̻� B 70�̻� C 60�̻� D 60�̸� F
 * */

public class Exam_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10���� �Է� : ");
		int dec = sc.nextInt();
		String bin="";
		while(dec != 0) {
			int mok = dec/2;
			int nmg = dec%2;
			bin = nmg+bin; //11001
			//bin = bin + nmg; //10011
			dec = mok;
		}
		System.out.println(bin);
	}
}
