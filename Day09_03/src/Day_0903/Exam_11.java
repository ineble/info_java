package Day_0903;

import Day_0903.bbb.Person;

/*
 * 클래스 : 설계도 -> 구조체 --> 사용자 정의 자료형
 * 객체 : 기능(메소드)과 속성(변수)이 포함된
 * */
public class Exam_11 {
	public static void main (String[] args) {
		Person p = new Person();
		p.bun =111;
		p.name="aaaa";
		p.age= 28;
		p.stuPrint();
		
	}
	
}

