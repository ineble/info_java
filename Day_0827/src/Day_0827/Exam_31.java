package Day_0827;
/*
 *��ȯ Ÿ�԰� �Ű�����
 *��ȯ Ÿ��(X) �Ű�����(X)
 *��ȯ Ÿ��(O) �Ű�����(X)
 *��ȯ Ÿ��(X) �Ű�����(O)
 *��ȯ Ÿ��(O) �Ű�����(O)
 * */

public class Exam_31 {
	static void test01() {
		System.out.println("test01() �޼ҵ尡 ȣ��Ǿ����ϴ�.");
	}
	static void sum(int x, int y) {
		int s = x + y;
		System.out.println("sum() �޼ҵ� ȣ�� : " + s);
	}
	static int add() {
		int s  = 0;
		for(int i = 1; i<6;i++) {
			s += i;
		}
		return s;
	}
	static String print(String name, int age) {
		String str = "�̸� : " + name + ",���̴� " + age;
		return str;
	}
	public static void main(String[] args) {
		test01();
		sum(10, 20);
		System.out.println(add());
		System.out.println(print("ȫ�浿", 150));
	}
}
