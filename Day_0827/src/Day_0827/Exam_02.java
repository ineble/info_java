package Day_0827;
/*
 *  1 -> + 
 *  2 -> -
 *  3 -> *
 *  4 -> /
 *  5 -> %
 * */
import java.util.Scanner;

public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계산기 : ");// 5 + 8
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
		
		
		if(op.equals("+")) {
			System.out.println(a + " " + op + " " + b + " = " + (a+b));
		}else if(op.equals("-")) {
			System.out.println(a + " " + op + " " + b + " = " + (a-b));
		}else if(op.equals("*")) {
			System.out.println(a + " " + op + " " + b + " = " + (a*b));
		}else if(op.equals("/")) {
			System.out.println(a + " " + op + " " + b + " = " + (a/b));
		}else if(op.equals("%")) {
			System.out.println(a + " " + op + " " + b + " = " + (a%b));
		}else {
			System.out.println("연산자 오류 입니다.");
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
