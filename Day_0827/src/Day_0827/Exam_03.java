package Day_0827;
/*
 *  1 -> + 
 *  2 -> -
 *  3 -> *
 *  4 -> /
 *  5 -> %
 * */
import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		int sw = 3;
		switch (sw) { // 변수, 수식
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
		default:
			System.out.println("입력오류입니다.");
		}
		
		
		/*switch (op) {
		case "1":
			System.out.println(a + b);
			break;
		case "2":
			System.out.println(a - b);
			break;
		case "3":
			System.out.println(a * b);
			break;	
		case "4":
			System.out.println(a / b);
			break;
		case "5":
			System.out.println(a % b);
			break;	
		default:
			System.out.println("계산이 끝났습니다 당신이 사용하는 문구는 사용할 수 없습니다.");
			break;
		}*/
	}
}
