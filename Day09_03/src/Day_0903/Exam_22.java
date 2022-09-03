package Day_0903;

class BB{
	int x = 10;
	void test() {
		System.out.println("Hello");
	}
}
class BBB extends BB{
	int y = 20;
	@Override
	void test() {
		System.out.println("Hello World");
	}

}


public class Exam_22 {
	public static void main (String[] args) {
		BB b1 = new BB();
		b1.x = 100;
		BBB bb1 =  new BBB();
		bb1.x=100;
		BB b2 = new BBB();
		bb1.y=100;
		b2.test();
		
		
	}
}

