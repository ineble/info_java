package Day_0820;
/* 대, 중 , 소 찾기
 * */
public class Exam_22 {
	public static void main(String[] args) {
		int a=7,b=5,c=8;
		int max, min, mid;
		if(a<b) {
			int M = a;
			a=b;
			b=M;
		}
		if(a<c) {
			int M = a;
			a=c;
			c=M;
		}
		if(b<c) {
			int M = b;
			b = c;
			c = M;
		}
		System.out.println("Max = " + a);
		System.out.println("MED = " + b);
		System.out.println("Min = " + c);
	}
}
