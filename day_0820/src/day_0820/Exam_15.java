package Day_0820;

/* 
 * (���ǽ�) ? �� : ����
 * */
public class Exam_15 {
	public static void main(String[] args) {
		//���� ������ �Ǵ� ���� ������
		int a=7,b=5,d=8;
		int max = (a>b)? a:b;
		max = (max>d)?max:d;
		System.out.println(max);
	}
}
