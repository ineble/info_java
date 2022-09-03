package Day_0903;

abstract class superB{ //추상클래스 : 미완성 설계도
	int add(int x) {
	int s = 0;
	for(int i = 1; i <x; i ++) {
		s+= i;
	}
	return s;
	}
	abstract void test(int a, int b);
}
class subD extends superB{
	@Override
	void test(int a,int b) {
		System.out.println(a + "+" + b + "=" + (a+b));
	}

}
class subE extends superB{
	@Override
	void test(int a,int b) {
		System.out.println(a + "*" + b + "=" + (a*b));
	}

}

class subF extends superB{
	@Override
	void test(int a,int b) {
		System.out.println(a + "/" + b + "=" + (a/b));
	}

}



public class Exam_23 {
	public static void main (String[] args) {
		superB sb1 = new subD();
		sb1.test(1, 4);
		sb1 = new subE();
		sb1.test(5, 7);
		sb1 = new subF();
		sb1.test(7, 2);
		
	}
}

