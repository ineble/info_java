package Day_0827;

import java.util.Scanner;

/*	평균이 90이상 A 80이상 B 70이상 C 60이상 D 60미만 F
 * */

public class Exam_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10진수 입력 : ");
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
