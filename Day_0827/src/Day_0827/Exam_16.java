package Day_0827;

/*	����� 90�̻� A 80�̻� B 70�̻� C 60�̻� D 60�̸� F
 * */

public class Exam_16 {
	public static void main(String[] args) {
		int x=0;
		int s=0;
		while(x<10) {//1,3,5,7,9
			x++;
			if(x%2==0) {
				continue;
			}
			s=s+x;
		}
		System.out.println(s);
		int x1=0;
		int s1=0;
		while(x1<10) {//1
			x1++;
			if(x1%2==0) {
				break;
			}
			s1=s1+x1;
		}
		System.out.println(s1);

	}
}
