package Day_0903;

class parent{
	int x = 10;
	parent(){
		System.out.println("Parent() 생성자 호출");
	}
	void test() {
		System.out.println("Parent x = " + x);
	}
}
class child extends parent{
	child(){
		System.out.println("Child() 생성자 호출");
	}
}


public class Exam_19 {
	public static void main (String[] args) {
		parent p1 = new parent();
		p1.x=500;
		p1.test();
		child c1 = new child();
		c1.x = 1000;
		c1.test();
	}
}

