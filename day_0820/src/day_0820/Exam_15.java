package Day_0820;

/* 
 * (조건식) ? 참 : 거짓
 * */
public class Exam_15 {
	public static void main(String[] args) {
		//조건 연산자 또는 삼항 연산자
		int a=7,b=5,d=8;
		int max = (a>b)? a:b;
		max = (max>d)?max:d;
		System.out.println(max);
	}
}
