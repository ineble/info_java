package Day_0903;

class AAA1{ //추상클래스 : 미완성 설계도
	int func(int num) {
		if(num ==1)
			return 1;
		return num + func(num-1);
	}
}
class AABB extends AAA1{

	@Override
	int func(int num) {
		if(num ==1)
			return 1;
		return num * func(num-1);
	}
	
}



public class Exam_24 {
	public static void main (String[] args) {
		AAA1 aa = new AAA1();
		System.out.println(aa.func(5));
		AAA1 aa1 = new AABB();
		System.out.println(aa1.func(5));
		AABB aa2 = new AABB();
		System.out.println(aa2.func(5));
		
	}
}

