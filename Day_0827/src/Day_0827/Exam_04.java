package Day_0827;
/*
 *  1 -> + 
 *  2 -> -
 *  3 -> *
 *  4 -> /
 *  5 -> %
 * */
import java.util.Scanner;

public class Exam_04{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");// 5 + 8
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
		switch (op) {
		case "+":
			System.out.println(a + " " + op + " " + b + " = " + (a+b));
			break;
		case "-":
			System.out.println(a + " " + op + " " + b + " = " + (a-b));
			break;
		case "*":
			System.out.println(a + " " + op + " " + b + " = " + (a*b));
			break;	
		case "/":
			System.out.println(a + " " + op + " " + b + " = " + (a/b));
			break;
		case "%":
			System.out.println(a + " " + op + " " + b + " = " + (a%b));
			break;	
		default:
			System.out.println("����� �������ϴ� ����� ����ϴ� ������ ����� �� �����ϴ�.");
			break;
		}
	}
}
