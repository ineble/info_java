package Day_0903;
/*
 * Ŭ���� : ���赵 -> ����ü --> ����� ���� �ڷ���
 * ��ü : ���(�޼ҵ�)�� �Ӽ�(����)�� ���Ե�
 * */
class Student{
	//�Ӽ��� ���� �� �ʵ�� ����
	int hakbun;
	String name;
	int age;
	//����� �޼ҵ��� ����
	 void stuPrint() {
		 System.out.println("�й���" + hakbun + "�Դϴ�." );
		 System.out.println("�̸���" + name + "�Դϴ�." );
		 System.out.println("���̴�" + age + "�Դϴ�." );
	 }
}


public class Exam_07 {
	public static void main (String[] args) {
		Student stu1 = new Student();
		stu1.hakbun = 1101;
		stu1.name = "���л�";
		stu1.age = 21;
		stu1.stuPrint();
		Student stu2 = new Student();
		stu2.hakbun = 2101;
		stu2.name = "���л�";
		stu2.age = 25;
		stu2.stuPrint();
	}
}
