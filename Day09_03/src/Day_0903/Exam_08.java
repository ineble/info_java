package Day_0903;
/*
 * Ŭ���� : ���赵 -> ����ü --> ����� ���� �ڷ���
 * ��ü : ���(�޼ҵ�)�� �Ӽ�(����)�� ���Ե�
 * */
class Cal{
	int n;
	int m;
	void print() {
		System.out.println("n = " + n + ", m = " + m);
	}
	int add() {
		return n + m;
	}
	int minus() {
		return n - m;
	}
	int multi() {
		return n * m;
	}
	int divide() {
		return n / m;
	}
}

public class Exam_08 {
	public static void main (String[] args) {
		Cal cal = new Cal();
		cal.n = 10;
		cal.m = 20;
		System.out.println(" + : " + cal.add());
		System.out.println(" - : " + cal.minus());
		System.out.println(" * : " + cal.multi());
		System.out.println(" / : " + cal.divide());
		
	}
}

