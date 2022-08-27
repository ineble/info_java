package Day_0827;
/*	평균이 90이상 A 80이상 B 70이상 C 60이상 D 60미만 F
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
		System.out.println("학점은 " + str + "입니다.");
		System.out.println("평균은 " + avg + "입니다.");
	}
}

