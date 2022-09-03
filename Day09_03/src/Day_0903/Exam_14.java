package Day_0903;

import Day_0903.bbb.Person;

class Hak{
	int bun;
	String name;
	int age;
	Hak(){}
	public Hak(int bun, String name, int age) {
		this.bun = bun;
		this.name = name;
		this.age = age;
	}
	void print() {
		System.out.println(bun + "\t" + name + "\t" + age);
	}
	
}
public class Exam_14 {
	public static void main (String[] args) {
		Hak hak1 = new Hak(5, "hihi", 48);
		hak1.print();
		
	}
	
}

