package Day_0903;
/*
 * 클래스 : 설계도 -> 구조체 --> 사용자 정의 자료형
 * 객체 : 기능(메소드)과 속성(변수)이 포함된
 * */
class Student{
	//속성은 변수 즉 필드로 정의
	int hakbun;
	String name;
	int age;
	//기능은 메소도르 정의
	 void stuPrint() {
		 System.out.println("학번은" + hakbun + "입니다." );
		 System.out.println("이름은" + name + "입니다." );
		 System.out.println("나이는" + age + "입니다." );
	 }
}


public class Exam_07 {
	public static void main (String[] args) {
		Student stu1 = new Student();
		stu1.hakbun = 1101;
		stu1.name = "김학생";
		stu1.age = 21;
		stu1.stuPrint();
		Student stu2 = new Student();
		stu2.hakbun = 2101;
		stu2.name = "복학생";
		stu2.age = 25;
		stu2.stuPrint();
	}
}
